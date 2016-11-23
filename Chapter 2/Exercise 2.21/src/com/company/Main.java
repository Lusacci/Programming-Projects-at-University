package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Financial Application: Calculate future investment value
        /*1.) Prompt investment amount, annual interest rate, and number of years
          2.) Calculate future investment value
          3.) Display this value. */
        Scanner input = new Scanner(System.in);
        System.out.println("I calculate the future investment value.");

        System.out.println("Please enter the investment amount: $");
        double investment = input.nextDouble();

        System.out.println("Now give me the annual interest rate in percent.");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = (annualInterestRate / 100.0) / 12;

        System.out.println("For how many years?");
        int years = input.nextInt();

        double futureInvestmentValue = investment * (Math.pow((1 + monthlyInterestRate), years * 12));

        System.out.println("Accumulated Value: $" + futureInvestmentValue);

    }
}
