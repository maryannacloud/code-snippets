package Revision4;

public class CountFrequencyOfGivenElement {

    public static void main(String[] args) {

        int[] nums = {2, 9, 7, 2, 5, 3, 2, 11, 2};

        int targetElement = 2;

        int frequency = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == targetElement) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
