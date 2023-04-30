import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
TASK:
You have the following array of integers: [3, 5, 7, 8, 3].
Write a method that returns true if the array contains a duplicate value, false otherwise.

Pseudo-code (approaches):
1. Since all we have to do is check whether the array contains duplicate numbers or not,
   but we don't have to actually find those duplicates and print them out, we can first
   add all the numbers in the array into a Set, and then compare their sizes. Why Set?

Set is a Collection that contains no duplicate elements, and when we attempt to add an
array of Integers with duplicates into a Set (.add()) - it will automatically eliminate the duplicates
and only store the unique elements.

2. We can solve this using Map Interface as well. First, we would create the method, which
uses Map to store frequency of each element in the given array, and then check if any element
has a frequency grates than 1.

3. We can sort the array and compare the elements next to each other.

4. We can also use a nested loop to solve this.

 */
public class CheckDuplicatesInArray {
    public static void main(String[] args) {

        int[] givenArray = {3, 5, 7, 8, 3};
        System.out.println(checkDuplicate(givenArray));
        System.out.println(containsDuplicate(givenArray));
    }

    // Approach #1:
    public static boolean checkDuplicate(int[] array) {

        Set<Integer> uniqueElements = new HashSet<>();

        for (int element : array) {
            if (!uniqueElements.add(element)) {
                return true;
            }
        }
        return false;
    }

    // Approach #2:
    public static boolean containsDuplicate(int[] array) {

        Map<Integer, Integer> frequesncyMap = new HashMap<>();

        for (int element : array) {
            if (frequesncyMap.containsKey(element)) {
                frequesncyMap.put(element, frequesncyMap.get(element) + 1);
            } else {
                frequesncyMap.put(element, 1);
            }

            if (frequesncyMap.get(element) > 1) {
                return true;
            }
        }
        return false;
    }
}
