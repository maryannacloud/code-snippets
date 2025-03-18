public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; // Generate first 10 Fibonacci numbers
        fibonacciIterative(n);
    }

    public static void fibonacciIterative(int n) {
        int first = 0, second = 1;
        System.out.print(first + " " + second + " "); // Print first two numbers

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
