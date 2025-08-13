package Revision8;

import java.util.Arrays;

public class CheckForAnagramString {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        char[] array1 = str1.toCharArray();
        char[] array2 = str1.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("Given strings are anagrams");
        } else {
            System.out.println("Given strings are not anagrams");
        }
    }
}
