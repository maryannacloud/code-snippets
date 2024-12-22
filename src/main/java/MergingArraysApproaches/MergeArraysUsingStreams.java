package MergingArraysApproaches;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArraysUsingStreams {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
