package Revision2;

public class ArrayManipulations {

    public static void main(String[] args) {

        int[] arr = {51, 12, 34, 64, 55};
        int[] arr1 = {1, 2, 4, 5};

        // 1) Print all numbers in reverse way
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 2) Check if we have number 34 in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 34) {
                System.out.println("Array contains number " + arr[i]);
                break;
            }
        }

        // 3) Find sum of all the element from array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of all numbers in the array is " + sum);

        // 4) Find missing number from 2nd array (assume it'll store sequential numbers and size is 5), output should be 3 as it's missing from 2nd array
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i + 1] - arr1[i] != 1) {
                System.out.println(arr1[i] + 1);
            }
        }
    }
}
