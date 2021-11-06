// Programmer: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* 8) This Program will prompts the user to enter the distance
        in meters to convert and get the distance in kilometers. */

import java.util.Scanner;

public class DS2_prob8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variable names
        double meter, kilometer;

        // Displaying the function of the program
        System.out.println("DISTANCE CONVERTER (METER -> KILOMETER)");
        System.out.println();

        // Prompts to have an input from the user
        System.out.print("Enter the Distance in Meter/s: ");
        meter = input.nextDouble();
        System.out.println();

        // formula to convert the meters into kilometers
        kilometer = meter / 1000;

        // Displaying the converted distance
        System.out.print(kilometer + " Kilometer/s = " + meter + " meter/s");

        input.close();
    }
}
