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

        String[] words = str.split("\\s+");


        Map<String, Integer> mapWordsToCount = new HashMap<>();

        for (int i = 0; i < words.length; i++){
            String w = words[i];
            mapWordsToCount.put(w, mapWordsToCount.getOrDefault(w, 0) + 1);
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
