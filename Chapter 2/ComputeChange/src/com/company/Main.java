package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Compute Change (Money Changing)

        Scanner input = new Scanner(System.in);
        System.out.println("Input an amount you'd like to convert!");

        // Numerical value given by the user
        double amountEntered = input.nextDouble();
        int remainingAmounts = (int)(amountEntered * 100); // this converts the value to cents.

        // Calculating dollars + remaining dollars
        int conversionToDollars = remainingAmounts / 100;
        remainingAmounts = remainingAmounts % 100;

        // Calculating amount to Quarters
        int conversionToQuarters = remainingAmounts / 25;
        remainingAmounts = remainingAmounts % 25;

        int conversionToDimes = remainingAmounts / 10;
        remainingAmounts = remainingAmounts % 10;

        int conversionToNickels = remainingAmounts / 5;
        remainingAmounts = remainingAmounts % 5;

        int remainingPennies = remainingAmounts;

        System.out.println("Your Amounts consists of:$ " + amountEntered + " consists of:");
        System.out.println("  " + conversionToDollars + " dollars " + conversionToQuarters + " Quarters " + conversionToDimes + " Dimes "
                + conversionToNickels + " Nickels " + remainingPennies + " pennies.");











    }
}
