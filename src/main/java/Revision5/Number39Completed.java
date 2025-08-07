package Revision5;

public class Number39Completed {
    /*
    Print the following pattern:
    *********
     *******
      *****
       ***
        *
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int k = 1; k < i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 11 - i*2; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
