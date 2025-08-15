package Revision8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintCommonElementsInTwoListsCompleted {

    public static void main(String[] args) {

        /*
        Input list 1: [1, 2, 7, 10, 11, 45]
        Input list 2: [3, 7, 45, 8, 12, 11]
         */

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(7);
        nums1.add(10);
        nums1.add(11);
        nums1.add(45);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(7);
        nums2.add(45);
        nums2.add(8);
        nums2.add(12);
        nums2.add(11);

        Set<Integer> setOfNums = new HashSet<>(nums1);
        Set<Integer> common = new HashSet<>();

        for (Integer n : nums2){
            if (setOfNums.contains(n)){
                common.add(n);
            }
        }

        common.forEach(System.out::println);
    }
}
