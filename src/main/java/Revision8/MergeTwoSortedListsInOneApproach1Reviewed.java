package Revision8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedListsInOneApproach1Reviewed {

    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(5);
        nums1.add(7);
        nums1.add(10);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(5);
        nums2.add(8);
        nums2.add(12);

        List<Integer> merged = new ArrayList<>();

        merged.addAll(nums1);
        merged.addAll(nums2);

        Collections.sort(merged);
        System.out.println(merged);
    }
}
