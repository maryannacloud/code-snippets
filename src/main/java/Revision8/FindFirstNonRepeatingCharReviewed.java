package Revision8;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharReviewed {

    // String: "aaabbbccddddeffggg"


    public static void main(String[] args) {

        String str = "zacdeb";

        char[] chars = str.toCharArray();

        Map<Character, Integer> chatCountMap = new HashMap<>();

        for (char c : chars) {
            if (!chatCountMap.containsKey(c)) {
                chatCountMap.put(c, 1);
            } else {
                chatCountMap.put(c, chatCountMap.get(c) + 1);
            }
        }

        for (char c : chars) {
            if (chatCountMap.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
