import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
TASK:
 * Given an array of integers "nums" and an integer target, return indices of the two numbers such that they add up to the target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].

 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]

 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]

 * nums = [2, 7, 11, 15], target = 9
 * Hint: 0=2, 1=7, 2=11, 3=15

Analyzing the problem:
Okay, so based on the given array of integers, and the target number, we have to write a method that will output
the indices of the integers that would sum up to the target number. In the case of our given array nums = [2, 7, 11, 15],
the target number is 9. By just looking at the array, we see that we can add up 2 and 7 to get the 9. These two numbers
are at the indices 0 and 1 respectively. So how can we write the method?

First, let's understand, since we have the numbers in array given to us - they are the 1st component of the sum equation:
1st complement + 2nd complement = sum (target), therefore - the second component will be (target - 1st component).
Then, lets understand that what the method needs to output is the indices of the numbers, and not the actual numbers.
In the hint given in the task, we can see that we can utilize Map Interface, and it's HashMap Class while solving this
task. So we can store the key(index) = value(number) pairs into the HashMap, but the thing is that there is really no method, that
returns the value of the single key itself, instead the value mapped to it (there is a .keySet() method, but it won't really
work here for us). So, with that said, what we can do it store the key(index) = value(number) in reversed way: key(number) = value(index),
and using the HashMap .get() method we can obtain the value(index) of the key(number) passed to a method. In order to return the
value(index), we have to first add those pairs to the map, and we can achieve that by iterating through the given array using
a regular for loop and on each iteration store the pairs to the map using the .put() method.

Pseudo-code (approaches):

1. Brute Force approach (Time Complexity: O(n^2)):
   NOTE: brute force is a primitive programming style, one in which the programmer relies on the computer's processing power,
   instead of using their own intelligence to simplify the problem, often ignoring problems of scale and applying naive methods,
   suited to small problems directly to large ones.

2. Two-pass Hash Table (Time Complexity: O(n))

3. One-pass Hash Table (Time Complexity: O(n)) - the most efficient:
   NOTE: iterates through the input array just once, while also building and querying the hash table during the same iteration.
         One-Pass Hash Table approach means that we build and query the hash table, while iterating through the input array just once.
         As we go through the input elements, we check if their complements are already in the hash table.
         If the complement is found - the solution is returned immediately. If not, the current element is added to the hash table, and the iteration continues.

         "One-pass": the algorithm only iterates through the input array once, meaning that it has a single loop.
         "Two-pass Hash Table" approach, which iterates through the input array twice: once to build the hash table and another time to find the solution.
         "Hash Table": a hash table (in Java, it's implemented as a HashMap) is a data structure that allows us to store and retrieve values based on a key.
         In this case, the hash table is used to store the indices of the input elements as values and their corresponding values as keys.
         The hash table provides fast lookups (O(1) average time complexity) to check whether a complement (target - nums[i]) is present in the table or not.
 */
public class TargetIndices {

    public static void main(String[] args) {
        int[] givenArray = {2, 7, 11, 15};
        int target = 9;

        int[] outputArray = findIndices(givenArray, target);
        System.out.println("Output: " + Arrays.toString(outputArray));
    }

    // Approach #3:
    public static int[] findIndices (int[] nums, int target){

        // declaring a HashMap Object, so that we have a storage space for our key(number) = value(index) pairs:
        Map<Integer, Integer> map = new HashMap<>();

        // iterating through the given array:
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            // adding the key(number) = value(index) pairs to the map:
            map.put(nums[i],i);

            // checking to see if the map contains the 2nd complement at the given point of iteration:
            if (map.containsKey(complement)) {

                // if the map does contain the 2nd complement, then we are creating a new array of ints with the
                // index of the 2nd complement (map.get(target - nums[i])) and the index of the current element:
                return new int[] {map.get(complement), i};
            }
        }
        return null;
    }
}
