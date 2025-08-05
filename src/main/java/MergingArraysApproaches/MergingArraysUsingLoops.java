package MergingArraysApproaches;

public class MergingArraysUsingLoops {

    public static void main(String[] args) {

        int[] array1 = {2, 3, 4, 7, 6, 5};
        int[] array2 = {9, 8, 5, 6, 7, 8};

        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;

        for (int num : array1){
            mergedArray[index++] = num;
        }

        for (int num : array2){
            mergedArray[index++] = num;
        }

        for (int num : mergedArray){
            System.out.print(num + " ");
        }
    }
}
