package StringManipulations;/*
TASK: given the following String - "aabbbccccd",
      write the method that will compress the String and provide the following output:

      Example Output: "a2b3c4d1"

Pseudo-code(approaches):

So pretty much here we need to iterate through the given string and as we are iterating,
we need to count the occurrence of each character. When we encounter a new character, or reach the end of the String,
we can append the previous character and its count to the result:

1. Using simple for loop and a StringBuilder: iterate through the string, count the occurrences, compare and append.

2. Using simple for loop and just concatenate the characters and their counts directly into a String. This approach
   might be less efficient, as String concatenation creates new String Objects in each iteration.
 */

public class CompressString {

    public static void main(String[] args) {
        String givenString = "aabbbccccd";

        String compressedStringWithBuilder = compressStringWithBuilder(givenString);
        System.out.println(compressedStringWithBuilder);

        String compressedString = compressString(givenString);
        System.out.println(compressedString);
    }

    // Approach #1:
    public static String compressStringWithBuilder (String string) {

        // Initialize a StringBuilder to store the compressed string:
        StringBuilder compressed = new StringBuilder();

        // Initialize a counter for the current character:
        int count = 1;

        // Iterate through the input string:
        for (int i = 1; i < string.length(); i++){

            // Compare the current character with the previous one:
            if (string.charAt(i) == string.charAt(i - 1)){
                // If they are the same, increment the counter:
                count++;

            // If they are different, append the previous character and its count to the result:
            } else {
                compressed.append(string.charAt(i - 1));
                compressed.append(count);

                // Reset the counter for the next character:
                count = 1;
            }
        }

        // Append the last character and its count to the result
        compressed.append(string.charAt(string.length() - 1));
        compressed.append(count);

        // Convert the StringBuilder to a String and return it
        return compressed.toString();
    }

    // Approach #2:
    public static String compressString (String string) {

        String compressed = "";
        // Initialize a counter for the current character:
        int count = 1;

        // Iterate through the input string:
        for (int i = 1; i < string.length(); i++) {
            // Compare the current character with the previous one:
            if (string.charAt(i) == string.charAt(i - 1)) {
                // If they are the same, increment the counter:
                count++;
            } else {
                // If they are different, append the previous character and its count to the result:
                compressed += string.charAt(i - 1) + Integer.toString(count);

                // Reset the counter for the next character
                count = 1;
            }
        }
        // Append the last character and its count to the result:
        compressed += string.charAt(string.length() - 1) + Integer.toString(count);

        // Return the compressed string
        return compressed;
    }

}
