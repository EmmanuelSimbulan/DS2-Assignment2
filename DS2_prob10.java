// Programmer: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* 10) This Program will prompts the user to enter the money
        in PH Peso to convert and get the amount in US Dollars. */

import java.util.Scanner;

public class DS2_prob10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variable names
        double peso, dollar;

        // Displaying the function of the program
        System.out.println("MONEY CONVERTER (PHP -> USD)");
        System.out.println();

        // Prompts to have an input from the user
        System.out.print("Enter the Philippine Peso (PHP): ");
        peso = input.nextDouble();
        System.out.println();

        // formula to convert the PHP into USD
        dollar = peso / 41.25;

        // Displaying the converted money
        System.out.print("₱" + String.format("%.2f", peso) + " = $" + String.format("%.2f", dollar));

        input.close();

    }
}
