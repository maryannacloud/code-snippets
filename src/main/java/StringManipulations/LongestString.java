package StringManipulations;/*
 Find the longest string in the list of strings
 */

public class LongestString {

    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "JavaScript", "C++", "Ruby"};
        String longestString = "";

        for (String string : strings) {
            if (string.length() > longestString.length()) {
                longestString = string;
            }
        }

        System.out.println("The longest string is: " + longestString);

    }
}
