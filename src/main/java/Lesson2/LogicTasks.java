package Lesson2;

public class LogicTasks {

    public static void main(String[] args) {

        String str = "marynan";// mar nan
        str = str.replace(" ", ""); // neveroddoreven 14

//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i));
//        }

//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));
//        }

//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed = reversed + str.charAt(i);
//        }
//        System.out.println(reversed);
//
//        if (str.equals(reversed)){
//            System.out.println("String " + str + " is a palindrome");
//        } else {
//            System.out.println("String " + str + " is not a palindrome");
//        }

        // Split the given string into 2 halves, if it's odd number of chars then remove middle char
        int num = str.length();
        System.out.println(num);

        String firstHalf = str.substring(0, num/2); // N=7, first=3, second=3
        System.out.println(firstHalf);

        String secondHalf = str.substring(num / 2);

        if(num%2!=0) {
            secondHalf = secondHalf.substring(1);
        }
        System.out.println(secondHalf);

    }
}
