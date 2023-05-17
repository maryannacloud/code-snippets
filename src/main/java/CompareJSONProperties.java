import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;

/*
TASK: you are given two API endpoints:
      1) 199.83.14.77:8080/api/v1/topMovies
      2) 199.83.14.77:8080/api/v1/movie/{id}

- the first endpoint retrieves a list of the top 10 Movies ranked in order (10 JSON Objects by default);
- the second endpoint will return the info about a movie, when passing a movie ID;
- the catch is: there are discrepancies in the JSON property values, or issues with some properties from the second endpoint;

GOAL: find the differences, and compare/point them out.

Example output:
The movie with the following {id} has mismatched properties: {property1} and {property2}
 */

public class CompareJSONProperties {

    public static void main(String[] args) {

        // Make API request to retrieve the list of top movies
        RequestSpecification request = RestAssured.given();
        Response response = request.get("http://199.83.14.77:8080/api/v1/topMovies");

        // Parse the response body into a JSON array
        JSONArray topMoviesArray = new JSONArray(response.getBody().asString());

        // Iterate over the top movies
        for (int i = 0; i < topMoviesArray.length(); i++) {
            // Get the movie ID
            String movieId = topMoviesArray.getJSONObject(i).getString("id");

            // Make API request to retrieve the movie details
            Response movieResponse = request.get("http://199.83.14.77:8080/api/v1/movie/" + movieId);

            // Parse the response body into a JSON object
            JSONObject movieDetails = new JSONObject(movieResponse.getBody().asString());

            // Compare properties between the two endpoints
            compareProperties(topMoviesArray.getJSONObject(i), movieDetails);
        }

    }

    private static void compareProperties(JSONObject topMovie, JSONObject movieDetails) {
        boolean equalProperties = true;

        // Compare and identify discrepancies
        for (String key : topMovie.keySet()) {
            Object topMovieValue = topMovie.get(key);
            Object movieDetailsValue = movieDetails.opt(key);

            if (!topMovieValue.equals(movieDetailsValue)) {
                equalProperties = false;
                System.out.println("The movie with ID " + topMovie.getString("id") + " has mismatched properties: " +
                        key + " (" + topMovieValue + ") and " + key + " (" + movieDetailsValue + ")");
            }
        }

        if (equalProperties) {
            System.out.println("The movie with ID " + topMovie.getString("id") + " has all properties equal.");
        }
    }
}
