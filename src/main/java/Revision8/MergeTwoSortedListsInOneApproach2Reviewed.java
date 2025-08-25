package Revision8;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedListsInOneApproach2Reviewed {

    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(4);


        List<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(5);
        nums2.add(8);
        nums2.add(12);

        List<Integer> merged = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.size() && j < nums2.size()){
            if (nums1.get(i) < nums2.get(j)) {
                merged.add(nums1.get(i++));
            } else{
                merged.add(nums2.get(j++));
            }
//            } else if (nums1.get(i) > nums2.get(j)) {
//                merged.add(nums2.get(j++));
//            }
//            } else {
//                merged.add(nums1.get(i++));
//                merged.add(nums2.get(j++));
//            }
        }

        while (i < nums1.size()) {
            merged.add(nums1.get(i++));
        }
        while (j < nums2.size()) {
            merged.add(nums2.get(j++));
        }

        for (int k = 0; k < merged.size(); k++){
            System.out.println(merged.get(k));
        }
    }
}
