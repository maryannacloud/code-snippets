package ArrayManipulations;

public class TwoSumLeetCode {
    public int[] twoSum(int[] nums, int target) {
        int[] arrayOfIndicies;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }
        return new int[0];
    }
}
