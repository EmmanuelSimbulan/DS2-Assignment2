// Programmer: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* 6) This Program will prompts the user to enter the base and height
        of the triangle to get the total area of the Triangle. */

import java.util.Scanner;

public class DS2_prob6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variable names
        double base, height, area_triangle;

        // Displaying the function of the program
        System.out.println("SOLVE FOR AREA OF THE TRIANGLE");
        System.out.println();

        // Prompts to have an input from the user
        System.out.print("Enter the Base of the Triangle: ");
        base = input.nextDouble();
        System.out.print("Enter the Height of the Triangle: ");
        height = input.nextDouble();
        System.out.println();

        // formula to get the total area of the triangle
        area_triangle = (base * height) / 2;

        // Displaying the total area of the triangle
        System.out.println("The Area of the Triangle is: " + String.format("%.2f", area_triangle));

        input.close();
    }
}
