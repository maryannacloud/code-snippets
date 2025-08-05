package Revision4;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {

        int[] arrayOfNums = {3, 76, 4, 56, 9, 77, 23};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arrayOfNums.length; i++){
            if (arrayOfNums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
