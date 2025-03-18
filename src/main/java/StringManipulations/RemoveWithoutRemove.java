package StringManipulations;/*
Task: write the program to remove number 2 from the string without using the remove method
      this2isth2esent2en2cewit2htwo22esi2ni
*/

import java.util.stream.Collectors;

public class RemoveWithoutRemove {
    public static void main(String[] args) {
        String input = "this2isth2esent2en2cewit2htwo22esi2nit";
        System.out.println(removeTwoStringBuilder(input));
        System.out.println(removeTwoStream(input));
        System.out.println(removeTwoCharArray(input));
    }

    public static String removeTwoStringBuilder(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != '2') {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }

    public static String removeTwoStream(String input) {
        return input.chars()
                .filter(ch -> ch != '2')
                .mapToObj(ch -> (char) ch)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static String removeTwoCharArray(String input) {
        char[] inputChars = input.toCharArray();
        int count = 0;

        for (int i = 0; i < inputChars.length; i++) {
            if (inputChars[i] != '2') {
                inputChars[count++] = inputChars[i];
            }
        }

        return new String(inputChars, 0, count);
    }

}
