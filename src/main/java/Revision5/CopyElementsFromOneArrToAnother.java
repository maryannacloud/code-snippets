package Revision5;

public class CopyElementsFromOneArrToAnother {

    public static void main(String[] args) {

        int[] arr = {8, 9, 6, 2, 5};

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }


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
