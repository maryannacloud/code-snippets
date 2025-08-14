package Revision8;

public class CheckIfStringIsPalindromeReviewed {
    public static void main(String[] args) {

        String str = "madam";

        String reversedString = "";

        for (int i = str.length() - 1; i > 0; i--){
            reversedString = reversedString + str.charAt(i);
        }

        if (str.equals(reversedString)){
            System.out.println("Given string is a palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
    }
}
