package MergingArraysApproaches;/*
Write a Java program to merge two arrays of numbers into one.
 */


import java.util.Arrays;

public class MergeArraysArrayCopyMethod {
    public static void main(String[] args) {
        int[] array1 = {8, 9, 3, 5, 6};
        int[] array2 = {4, 7, 2, 8, 6};

        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
