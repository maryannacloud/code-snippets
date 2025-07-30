package Collections;

/*
Task: Write a program to print duplicate chars from the given String.
Example input: This is my collection program
Example output: r, s, c, t, i, l, m,  , o
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateCharsFromString {

    public static void main(String[] args) {

        String sentence = "This is my collection program";
        String transformedSentence = sentence.toLowerCase();

        Set<Character> encounteredCharacters = new HashSet<>();

        Set<Character> repeatedCharacters = new LinkedHashSet<>();

        for (char c : transformedSentence.toCharArray()){
            if (encounteredCharacters.contains(c)){
                repeatedCharacters.add(c);
            } else {
                encounteredCharacters.add(c);
            }
        }

        for (char c : repeatedCharacters){
            System.out.print(c + ", ");
        }
    }
}
