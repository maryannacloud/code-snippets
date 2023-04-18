/*
Task: write the program to remove number 2 from the string without using the remove method
      this2isth2esent2en2cewit2htwo22esi2ni
*/

public class RemoveWithoutRemove {
    public static void main(String[] args) {
        String input = "this2isth2esent2en2cewit2htwo22esi2nit";
        System.out.println(removeTwo(input));
    }

    public static String removeTwo(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != '2') {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
