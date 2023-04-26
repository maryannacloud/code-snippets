/*
TASK: given an Array A of N integers, write a method, which returns the smallest positive integer (greater than 0),
      that does not occur in the Array A.

      For example:
      Given A = [1, 3, 6, 4, 1, 2], the method should return 5.
      Sorted: A = [1, 1, 2, 3, 4, 6]
      Given A = [1, 2, 3], the method should return 4.
      Given A = [-1, -3], the method should return 1.

Write an efficient algorithm for the following assumptions:
      - N is an integer with the range [1...100,000];
      - each element of an array A is an integer with the range [-1,000,000...1,000,000].
 */

import java.util.Arrays;

// Approach 1: using two for loops
public class FindSmallestPositiveInArray {

    // the time complexity of the method below is O(n), where n is the length of the "givenArray":
    public int findSmallestPositive(int[] givenArray){

        int n = givenArray.length;

        // here we are initializing a boolean array positiveIntegers to keep track of the positive integers found in the givenArray:
        // NOTE: the array's length is N + 1 is on purpose, it is to ensure we can accommodate all possible integers in the range [1...N].
        boolean[] positiveIntegers = new boolean[n + 1];

        // here we are iterating through the givenArray, and every time we run into a positive integer within the required range (1...n),
        // we set the corresponding index of the givenArray element in the positiveIntegers array to true:
        for (int j : givenArray) {
            if (j > 0 && j <= n) {
                positiveIntegers[j - 1] = true;
            }
        }

        // here we already iterate through teh positiveIntegers array to find the first index with the value "false",
        // this index corresponds with the smallest positive integer that doesnt occur in the givenArray:
        for (int i = 0; i <= n; i++){
            if (!positiveIntegers[i]) {
                return i + 1;
            }
        }
        return n + 1;
    }

    // Approach 2: using the .sort() method of the Arrays Class
    // NOTE: this is a less efficient approach than the one we have above, due to it's sorting functionality

    public int findSmallestPositiveInArraySort( int[] givenArray){

        // sorting the array first - .sort(givenArray) has the time complexity O(N * log(N)) for an array of length N
        Arrays.sort(givenArray);

        // initializing the smallest positive integer to 1, since the requirement was that this number should be more than 0:
        int smallestPositiveInt = 1;

        // iterate through the sorted array to find the smallest positive integer that doesn't occur in the array,
        // since the array is sorted, we can stop iterating when we find an integer greater than the current smallest missing positive integer,
        // as any subsequent integers will be equal or greater:
        for (int i : givenArray){
            if (givenArray[i] == smallestPositiveInt) {
                smallestPositiveInt++;
            } else if (givenArray[i] > smallestPositiveInt) {
                break;
            }
        }
        return smallestPositiveInt;
    }
}
