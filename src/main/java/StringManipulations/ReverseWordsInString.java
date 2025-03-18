package StringManipulations;

/*

TASK: given the following String - "This is Java Program",
      write the method that will put the words in the reverse order.

      Example Output: "Program Java is This"

Pseudo-code(approaches):
1. We can first split the given String into separate words, using " " regex,
   then reverse the order of the word, and using .join() method - put them back together.
   NOTE: .join() method - returns a new String, composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.

2. We can also use the StringBuilder and its .append() method to build a reversed String.
   NOTE: .append() is used to concatenate (join) the specified value to the current character sequence in the StringBuilder object.

3. Using simple for loop.

*/

public class ReverseWordsInString {
    public static void main(String[] args) {
        String givenString = "This is Java Program";

        String reversedStringJoin = reverseWordsJoin(givenString);
        System.out.println(reversedStringJoin);

        String reversedStringStringBuilder = reverseWordsStringBuilder(givenString);
        System.out.println(reversedStringStringBuilder);

        String reversedStringWithForLoop = reverseWordsForLoop(givenString);
        System.out.println(reversedStringWithForLoop);
    }

    public static String reverseWordsJoin (String string){

        String[] splitWords = string.split(" ");

        int left = 0;
        int right = splitWords.length - 1;

        while (left < right){
            String temp = splitWords[left];
            splitWords[left] = splitWords[right];
            splitWords[right] = temp;
            left++;
            right--;
        }
        String reversed = String.join(" ", splitWords);
        return reversed;
    }

    public static String reverseWordsStringBuilder (String string) {

        String[] splitWords = string.split(" ");
        int left = 0;
        int right = splitWords.length - 1;

        while (left < right){
            String temp = splitWords[left];
            splitWords[left] = splitWords[right];
            splitWords[right] = temp;
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();
        // Iterate through the words and append them to the StringBuilder
        for (int i = 0; i < splitWords.length; i++) {
            sb.append(splitWords[i]);

            // Add a space after each word, except for the last word
            if (i < splitWords.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String reverseWordsForLoop (String string) {

        String[] splitWords = string.split(" ");
        String reversedString = "";

        for (int i = splitWords.length - 1; i >= 0; i--){
            reversedString = reversedString + splitWords[i] + " ";
        }

        return reversedString;
    }

}
