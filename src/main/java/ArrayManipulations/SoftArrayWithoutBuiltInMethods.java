package ArrayManipulations;

/*
TASK: Sort an array without using any built-in methods.

Pseudo-code (approaches):
1. First, if the interviewer did not specify in which order to sort an array,
clarify whether they would like the array to be sorted in the ascending or descending order.
2. Then explain, that in order to sort an array without using a built-in method - we have to use bubble sort technique.
3. Bubble sort technique utilizes two loops - outer and inner, if statement and temporary variable for swapping the values places.

 */

import java.util.Arrays;

public class SoftArrayWithoutBuiltInMethods {

    public static void sortAnArrayAscending(int[] unsortedArray) {

        int n = unsortedArray.length;

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {

        int[] unsortedArray = new int[] {5, 2, 9, 1, 5, 6};
        sortAnArrayAscending(unsortedArray);
        for (int num : unsortedArray){
            System.out.println(num + " ");
        }
    }
}
