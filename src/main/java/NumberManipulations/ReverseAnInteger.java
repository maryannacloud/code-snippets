package NumberManipulations;

/*
Write a function that will reverse a given integer.
Input: 1234
Output: 4321
 */

public class ReverseAnInteger {

    public static void main(String[] args) {
        int number = 1234;
        //System.out.println("Reversed number is: " + reverseAnInteger(number));
        System.out.println("Reversed number is: " + reverseUsingStringBuilder(number));
    }

    // this is the most efficient and performant approach to solving the task:
    public static int reverseAnInteger(int number){

        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int reverseUsingStringBuilder(int number){
        boolean isNegative = number < 0;
        String intConvertedToStr =
                new StringBuilder(String
                        .valueOf(Math.abs(number)))
                        .reverse()
                        .toString();
        int reversed = Integer.parseInt(intConvertedToStr);
        return isNegative ? -reversed : reversed;
    }

}
