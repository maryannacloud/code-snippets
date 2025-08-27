package Revision8;

import java.util.*;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4));

        Set<Integer> setOfNums = new HashSet<>(nums);

        System.out.println(setOfNums);
    }
}
