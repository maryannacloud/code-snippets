package Revision3;

public class Loops {

    public static void main(String[] args) {

//        // Print following patterns
//        // 1 Hello 2 Hello 3 Hello 4 Hello 5 Hello
//        // 1 Hello 2 Hello 3 Hello 4 Hello 5 Hello
//        // 1 Hello 2 Hello 3 Hello 4 Hello 5 Hello
//        // 1 Hello 2 Hello 3 Hello 4 Hello 5 Hello
//        // 1 Hello 2 Hello 3 Hello 4 Hello 5 Hello
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j + " Hello ");
//            }
//            System.out.println();
//        }


//        // Print following patterns
//        // 1 Hello 1 Hello 1 Hello 1 Hello 1 Hello
//        // 2 Hello 2 Hello 2 Hello 2 Hello 2 Hello
//        // 3 Hello 3 Hello 3 Hello 3 Hello 3 Hello
//        // 4 Hello 4 Hello 4 Hello 4 Hello 4 Hello
//        // 5 Hello 5 Hello 5 Hello 5 Hello 5 Hello
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(i + " Hello ");
//            }
//            System.out.println();
//        }

//        // Print following patterns
//        // 1
//        // 12
//        // 123
//        // 1234
//        // 12345
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Print following patterns
        //    1
        //   12
        //  123
        // 1234
        //12345
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }


//        // Find out missing number from the array without sorting
//        // [5, 2, 1, 4] => Output should be 3
//        int[] arr = {5, 2, 1, 4};
//        int arrayLength = arr.length;
//        int sumOfArrayElements = arrayLength * (arrayLength + 1) / 2;
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//        int missing = sumOfArrayElements - sum;
//        System.out.println("Missing number is: " + missing);
//    }
    }
}
