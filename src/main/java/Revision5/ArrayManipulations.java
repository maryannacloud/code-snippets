package Revision5;

public class ArrayManipulations {
    public static void main(String[] args) {

        // Task1:
        // Find the max number from the given array
        // Pseudo-code:
        // Number of times we need to traverse the array - 1
        // Remember the number at index 1 as the max number

        int[] arr = {4, 9, 7, 3, 1, 0};

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }

        System.out.println(maxNumber);
    }
}
