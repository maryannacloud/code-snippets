public class NumberPalindromeOrNot {
    public static void main(String[] args) {

        System.out.println(checkIfNumberIsPalindrome1(1234321));

        /*
        num = 1234321
        1234321 % 10 = 1 - last digit
        1234321 / 10 = 123432
        123432 % 10 = 2
        123432 / 10 = 12343
        12343 % 10 = 3
        12343 / 10 = 1234
        1234 % 10 = 4
        1234 / 10 = 123
        123 % 10 = 3
        123 / 10 = 12
        12 % 10 = 2
        12 / 10 = 1 - first digit
         */

    }

    public static String checkIfNumberIsPalindrome1(int num) {

        String responseMessage = "";
        int lastDigit = num % 10;
        int firstDigit = 0;

        while (lastDigit >= firstDigit){
            num = num / 10;
            firstDigit = num;

            if (firstDigit != lastDigit){
                responseMessage = "Given number is not a palindrome";
            } else {

            }
        }

        return responseMessage;
    }

    public static String checkIfNumberIsPalindrome2(int num) {

        String responseMessage = "";
        int lastDigit = num % 10;
        int firstDigit;

        do {
            num = num / 10;
        } while (num > 0);

        firstDigit = num;

        if (firstDigit != lastDigit){
            responseMessage = "Given number is not a palindrome";
        } else {

        }

        return responseMessage;
    }
}
