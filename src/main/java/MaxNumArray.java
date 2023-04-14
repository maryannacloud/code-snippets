/*
TASK: create an array of random numbers and write the code to find the max number in that array.
 */
public class MaxNumArray {

    public static void main(String[] args) {
        // Example 1 data:
        int[] givenArray1 = {50, 10, 20, 8, 1, 9, 399, 100};
        System.out.println("The maximum number in an array is: " + findMax1(givenArray1));

        // Example 2 data:
        int[] givenArray2 = {1, 2, 3, 4567, 6, 1, 455678, 0, 5};
        System.out.println("The maximum number in an array is: " + findMax2(givenArray2));

    }

    public static int findMax1 (int[] array){

        // lets create a variable, and initialize it with the first element of the array:
        int max = array[0];

        // lets loop through an array using the regular for loop (we can also use an enhanced for loop here)
        for (int i = 0; i < array.length; i++){
            // let's set a condition for each iteration:
            if (array[i] >= max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findMax2 (int[] array){

        int max = array[0];
        for (int element : array){
            if (array[element] >= max){
                max = array[element];
            }
        }
        return max;
    }
}
