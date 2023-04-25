/*
TASK: given two Strings, return true if one of them is an anagram of another, and false otherwise.

NOTE: Anagram - a word or a phrase formed by rearranging the letters of a different word or phrase,
      typically using all the original letters exactly once.

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

Approach:
Step 1: Convert the Strings to Character Arrays
Step 2: Check if the lengths of the Strings are equal
Step 3: Sort the Character Arrays
Step 4: Compare the sorted Character Arrays
 */

import java.util.Arrays;

public class CheckStringsAnagramOrNot {

    public static boolean isAnagram (String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        if (charArray1.length != charArray2.length){
            return false;
        }

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
