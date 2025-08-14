package Revision8;

public class ReverseEachWordInSentenceCompleted {

    public static void main(String[] args) {

        String str = "Each word in this String is reversed";

        String[] words = str.split(" ");

        for (String word : words){
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--){
                reversedWord += word.charAt(i);
            }
            System.out.print(reversedWord + " ");
        }
    }
}
