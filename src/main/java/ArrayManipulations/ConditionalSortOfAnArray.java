package ArrayManipulations;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionalSortOfAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            scanner.nextLine();

            if (size <= 0) {
                throw new IllegalArgumentException(("Array size must be greater than 0."));
            }

            System.out.println("Enter " + size + " integers, separated by spaces: ");
            String inputLine = scanner.nextLine();
            String[] tokens = inputLine.trim().split("\\s+");

            if (tokens.length != size) {
                throw new IllegalArgumentException("Expected " + size + " numbers, but received " + tokens.length + ".");
            }

            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.print("Enter sort type (ASC/DESC): ");
            String sortType = scanner.next().toUpperCase();

            if (!sortType.equals("ASC") && !sortType.equals("DESC")) {
                throw new IllegalArgumentException("Unsupported Sort Type: " + sortType);
            }

            bubbleSort(numbers, sortType.toUpperCase());
            System.out.println("Sorted Array: " + Arrays.toString(numbers));

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array size does not match the number of inputs provided.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void bubbleSort(int[] arr, String sortType){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                boolean shouldSwap;

                if ("DESC".equals(sortType)) {
                    shouldSwap = arr[j] < arr[j + 1];
                } else {
                    shouldSwap = arr[j] > arr[j + 1];
                }

                if (shouldSwap) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
