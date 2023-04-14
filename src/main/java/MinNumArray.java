/*
TASK:
1. Given the following array of numbers, write a method that finds the minimum number:
   nums = [1, 2, 3, 4567, 6, 1, 455678, 0, 5];
 */

public class MinNumArray {

    public static void main(String[] args) {

        // Example#1 data:
        int[] givenArray1 = {1, 2, 3, 4567, 6, 1, 455678, 0, 5};
        System.out.println(findMin1(givenArray1));

    }

    public static int findMin1(int[] givenArray1) {

        int min = givenArray1[0];

        for (int element : givenArray1){
            if (element <= min){
                min = element;
            }
        }
        return min;
    }
}
