package Revision8;

import java.util.*;

public class PrintMostRepeatedStringCompleted {
    /*
        Input - "Hello hello world! This is a test. Hello world, hello Java Java Java."
    */

    public static void main(String[] args) {

        String str = "Hello hello world! This is a test. Hello world, hello Java Java Java.";

        str = str.replace("!", "");
        str = str.replace(",", "");
        str = str.replace(".", "");
        str = str.toLowerCase();

        String[] words = str.split(" ");


        Map<String, Integer> mapWordsToCount = new HashMap<>();

        for (String word : words){
            if (!mapWordsToCount.containsKey(word)) {
                mapWordsToCount.put(word, 1);
            } else {
                mapWordsToCount.put(word, mapWordsToCount.get(word) + 1);
            }
        }


        String most = null;
        int max = 0;

        for (Map.Entry<String, Integer> e : mapWordsToCount.entrySet()) {
            if (e.getValue() > max) {
                most = e.getKey();
                max = e.getValue();
            }
        }
        System.out.println(most + " -> " + max);
    }
}
