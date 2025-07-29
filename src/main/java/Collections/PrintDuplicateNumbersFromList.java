package Collections;

/*
Task: Write a program to print a number, which is duplicated in the given list of numbers.

Example Input: 34, 54, 34, 56, 54
Example Output: 34, 54

 */

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateNumbersFromList {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(34);
        listOfNumbers.add(54);
        listOfNumbers.add(34);
        listOfNumbers.add(56);
        listOfNumbers.add(54);

        for (int i = 0; i < listOfNumbers.size(); i++){
            for (int j = i + 1; j < listOfNumbers.size(); j++){
                if (listOfNumbers.get(i).equals(listOfNumbers.get(j))){
                    System.out.println(listOfNumbers.get(i));
                }
            }
        }
    }
}
