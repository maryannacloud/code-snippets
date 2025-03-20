import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {

    }

    public static void ifElseModuloFizzBuzz(){
        int n = 50;

        for (int i = 1; i <= n; i++) {
            if (i % n == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 15 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void stringBuilderFizzBuzz() {
        int n = 50;

        for (int i = 1; i <= n; i++) {
            StringBuilder result = new StringBuilder();

            if (i % 3 == 0) result.append("Buzz");
            if (i % 5 == 0) result.append("Fizz");
            if (i % 15 == 0) result.append("FizzBuzz");

            System.out.println(!result.isEmpty() ? result.toString() : i);
        }
    }

    public static void mapFizzBuzz() {

            int limit = 50;
            int n = 15;

            Map<Integer, String> rules = new LinkedHashMap<>();
            rules.put(3, "Buzz");
            rules.put(5, "Fizz");
            rules.put(n, "FizzBuzz");

            for (int i = 1; i <= limit; i++) {
                StringBuilder output = new StringBuilder();

                for (Map.Entry<Integer, String> entry : rules.entrySet()) {
                    if (i % entry.getKey() == 0) {
                        output.append(entry.getValue());
                    }
                }

                System.out.println(!output.isEmpty() ? output.toString() : i);
            }
    }

    public static void streamsFizzBuzz(){
        int n = 15; // Custom FizzBuzz condition

        IntStream.rangeClosed(1, 50)
                .mapToObj(i -> (i % n == 0) ? "FizzBuzz"
                        : (i % 3 == 0) ? "Buzz"
                        : (i % 5 == 0) ? "Fizz"
                        : String.valueOf(i))
                .forEach(System.out::println);
    }

    public static void arrayFizzBuzz(){
        int n = 15;
        int limit = 50;
        String[] results = new String[limit];

        for (int i = 1; i <= limit; i++) {
            results[i - 1] = (i % n == 0) ? "FizzBuzz"
                    : (i % 3 == 0) ? "Buzz"
                    : (i % 5 == 0) ? "Fizz"
                    : String.valueOf(i);
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
