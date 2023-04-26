/*
TASK: given an Array A of N integers, write a method, which returns the smallest positive integer (greater than 0),
      that does not occur in the Array A.

      For example:
      Given A = [1, 3, 6, 4, 1, 2], the method should return 5.
      Given A = [1, 2, 3], the method should return 4.
      Given A = [-1, -3], the method should return 1.

Write an efficient algorithm for the following assumptions:
      - N is an integer with the range [1...100,000];
      - each element of an array A is an integer with the range [-1,000,000...1,000,000].
 */

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
}
