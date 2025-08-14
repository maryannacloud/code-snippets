package Revision8;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyInStringCompleted {

    // Input: "Hello World 123! Hello, Java"

    public static void main(String[] args) {

        String str = "Hello World 123! Hello, Java";
        str = str.replace("!", "");
        str = str.replace(",", "");

        System.out.println(str);
        System.out.println();

        String[] words = str.split(" ");

        for (String word : words){
            System.out.println(word);
        }

        System.out.println();

        Map<String, Integer> countOfWords = new HashMap<>();

        for (String word : words){
            if (!countOfWords.containsKey(word)) {
                countOfWords.put(word, 1);
            } else {
                countOfWords.put(word, countOfWords.get(word) + 1);
            }
        }

        for (Map.Entry<String, Integer> pair : countOfWords.entrySet()){
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }
}
