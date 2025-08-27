import java.util.ArrayList;
import java.util.List;

public class Solution1 {

        public int minOperations(List<Integer> nums, int k) {
            int sum = 0;

            for (int i = 1; i <= k; i++){
                sum = sum + i;
            }

            int count = 0;

            List<Integer> visitedNumbers = new ArrayList<>();

            for (int i = nums.size() - 1; i >= 0; i--) {
                if (nums.get(i) <= k && !visitedNumbers.contains(nums.get(i))){
                    sum = sum - nums.get(i);
                }
                count++;

                visitedNumbers.add(nums.get(i));

                if (sum == 0){
                    break;
                }
            }

            return count;
        }
    }

