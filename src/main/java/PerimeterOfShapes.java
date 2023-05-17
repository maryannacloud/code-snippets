import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of sides for the shape: ");
        int numberOfSides = sc.nextInt();
        double a = 0, b = 0, c = 0, d = 0;
        String typeOfShape = "";
        String nameOfShape = "";
        double perimeter = 0;

        if (numberOfSides == 3) {
            System.out.println("Please enter the length for the side 'a': ");
            a = sc.nextDouble();
            System.out.println("Please enter the length for the side 'b': ");
            b = sc.nextDouble();
            System.out.println("Please enter the length for the side 'c': ");
            c = sc.nextDouble();
            perimeter = a + b + c;

            if (a == b && b == c) {
                nameOfShape = "Equilateral";
            } else if (a == b || a == c || b == c) {
                nameOfShape = "Isosceles";
            } else {
                nameOfShape = "Scalene";
            }
            typeOfShape = "Triangle";

        } else if (numberOfSides == 4) {
            System.out.println("Please enter the length for the side 'a': ");
            a = sc.nextDouble();
            System.out.println("Please enter the length for the side 'b': ");
            b = sc.nextDouble();
            System.out.println("Please enter the length for the side 'c': ");
            c = sc.nextDouble();
            System.out.println("Please enter the length for the side 'd': ");
            d = sc.nextDouble();
            perimeter = a + b + c + d;

            if (a == b && b == c && c == d) {
                nameOfShape = "Square";
            } else if (a == c && b == d || a == b && c == d || a == d && b == c) {
                nameOfShape = "Rectangle";
            } else {
                nameOfShape = "Quadrilateral";
            }
            typeOfShape = "Quadrilateral";
        }

        System.out.println("The shape you've created is: " + nameOfShape + " " + typeOfShape +
                " and the perimeter is: " + perimeter);
    }
}
