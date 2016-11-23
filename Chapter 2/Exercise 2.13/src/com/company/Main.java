package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Financial application: Compound Value
        /*1.) Prompt the user for a monthly saving amount
          2.) Display the account value after the 6th month */
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there! I calculate the compounded value every month!");
        System.out.println("Enter the monthly saving amount: $");
        double monthlySavingAmount = input.nextDouble();

        int annualPercentage = 5;
        double monthlyPercentageRate = (annualPercentage / 100.0) / 12;

        double firstMonthAccount = monthlySavingAmount * (1 + monthlyPercentageRate);
        double secondMonthAccount = (monthlySavingAmount + firstMonthAccount) * (1 + monthlyPercentageRate);
        double thirdMonthAccount = (monthlySavingAmount + secondMonthAccount) * (1 + monthlyPercentageRate);
        double fourthMonthAccount = (monthlySavingAmount + thirdMonthAccount) * (1 + monthlyPercentageRate);
        double fifthMonthAccount = (monthlySavingAmount + fourthMonthAccount) * (1 + monthlyPercentageRate);
        double sixthMonthAccount = (monthlySavingAmount + fifthMonthAccount) * (1 + monthlyPercentageRate);

        System.out.println("After the sixth month, the account value is: $" + sixthMonthAccount);

    }
}
