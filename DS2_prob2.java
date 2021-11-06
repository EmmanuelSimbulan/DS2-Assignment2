// Programmer: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* 2) This Program will convert the side of a square into
    Perimeter and Area */

import java.util.Scanner;

public class DS2_prob2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double side,    // variable name for the side of a square
            Perimeter,  // variable name of Perimeter
            Area;       // variable name of Area

        // Displaying the function of the program
        System.out.println("Side of a Square Converter");
        System.out.println();
        
        // Prompts to have an input from the user
        System.out.print("Enter the Side of a Square: ");
        side = input.nextDouble();
        System.out.println();

        Perimeter = side * 4;   // formula to get the Perimeter
        Area = side * side;     // formula to get the Area

        // Displaying the Conversion of the Side of a Square
        System.out.println("Perimeter: " + String.format("%.2f", Perimeter) + " in");
        System.out.println("Area: " + String.format("%.2f", Area) + " in²");

        input.close();
    }
}