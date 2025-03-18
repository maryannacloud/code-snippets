package ArrayManipulations;

import java.util.Arrays;

public class FindMedianOfAnArray {

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 3, 9, 5};
        int[] arr2 = {8, 2, 4, 6, 10, 12};

        System.out.println("Median of arr1: " + findMedian(arr1));
        System.out.println("Median of arr2: " + findMedian(arr2));

    }

    public static double findMedian(int[] nums){
        Arrays.sort(nums);

        int n = nums.length;
        if (n % 2 == 1) {
            return nums[n / 2];
        } else {
            return (nums[n / 2] + nums[n / 2 - 1]) / 2.0;
        }
    }
}
