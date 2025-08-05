package Revision4;

public class SumOfAllElementsInArray {

    public static void main(String[] args) {

        int[] nums = {23, 8, 97, 65, 4, 4};

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        System.out.println(sum);
    }
}
