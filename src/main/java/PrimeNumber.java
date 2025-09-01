public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(checkIfNumberIsPrimeOrNot(101));

    }

    public static String checkIfNumberIsPrimeOrNot (int num) {

        String responseMessage = "";

        if (num <= 1) {
            responseMessage = "Please enter the number that is more than 1";
        } else {
            if (num == 2 || num % 2 != 0) {
                responseMessage = "Number " + num + " is a prime number!";
            } else {
                responseMessage = "Number " + num + " is not a prime number!";
            }
        }
        return responseMessage;
    }
}
