package MergingArraysApproaches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingArraysUsingListAndConversion {
    public static void main(String[] args){

        Integer[] array1 = {9, 3, 5};
        Integer[] array2 = {7, 6, 8};

        List<Integer> list = new ArrayList<>(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));

        Integer[] mergedArray = list.toArray(new Integer[0]);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
