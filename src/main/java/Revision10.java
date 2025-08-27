public class Revision10 {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int firstIndex = 0;
            int lastIndex = nums.length - 1;
            int middleIndex = (firstIndex + lastIndex) / 2;

            while (firstIndex < lastIndex) {
                if (target == nums[middleIndex]) {
                    return middleIndex;
                } else if (target < nums[middleIndex]) {
                    lastIndex = middleIndex;
                    middleIndex = (firstIndex + lastIndex) / 2;
                } else if (target > nums[middleIndex]) {
                    firstIndex = middleIndex;
                    middleIndex = (firstIndex + lastIndex) / 2;
                }
            }
            return firstIndex;
        }
    }
}
