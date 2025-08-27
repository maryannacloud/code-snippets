public class Revision9 {

    public static void main(String[] args) {

        String sentence = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(sentence));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();

        String[] words = s.split(" ");

        int length = words[words.length - 1].length();

        return length;
    }
}
