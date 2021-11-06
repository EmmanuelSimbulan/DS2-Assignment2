// Programmer: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* 4) This Program will prompts the user to enter the Original Price,
    Salvage Value, Estimated Year of life of the Merchandise to
    get the Depreciation and its rate. */

import java.util.Scanner;

public class DS2_prob4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variable names
        double original_price,
                salavage_value,
                estimated_year,
                depreciation,
                rate_depreciation;

        // Displaying the function of the program
        System.out.println("MERCHANDISE DEPRECIATION AND ITS RATE CONVERTER");
        System.out.println();

        // Prompts to have an input from the user
        System.out.println("Enter the Following: ");
        System.out.print("Original Price: ");
        original_price = input.nextDouble();
        System.out.print("Salvage Value: ");
        salavage_value = input.nextDouble();
        System.out.print("Estimated year of life: ");
        estimated_year = input.nextDouble();
        System.out.println();

        // formula to get the Depreciation and its rate
        depreciation = (original_price - salavage_value) / estimated_year;
        rate_depreciation = (depreciation / original_price) * 100;

        // Displaying the Depreciation and its rate
        System.out.println("The Depreciation of the Merchanise is: " + String.format("%.2f", depreciation));
        System.out.println("The Rate of Depreciation of the Merchanise is: " + String.format("%.2f", rate_depreciation));

        input.close();

    }
}
