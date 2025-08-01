package Collections;

/*
Write a program that: Creates an ArrayList<String> to store shopping items.

Adds at least 5 items to the list.
Removes one item by name.
Sorts the list alphabetically.
Prints the final list.

Ask the user to input the item to remove (using Scanner).
 */

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        ArrayList<String> cartItems = new ArrayList<>();
        cartItems.add("skirt");
        cartItems.add("skort");
        cartItems.add("jacket");
        cartItems.add("pants");
        cartItems.add("jeans");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Please enter items to remove from your cart: ");

        removeCartItemByName(cartItems, name);
        sortItemsInAlphabeticalOrder(cartItems);
        System.out.println(cartItems);
    }

    public static void removeCartItemByName(ArrayList<String> cartItems, String nameOfItem){
        cartItems.remove(nameOfItem);
    }

    public static void sortItemsInAlphabeticalOrder(ArrayList<String> cartItems){
        Collections.sort(cartItems);
    }
}
