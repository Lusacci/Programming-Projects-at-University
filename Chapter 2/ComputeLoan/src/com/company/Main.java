package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Computing the Loan Amount.
        /* Prompt the User, ask for the correct variables given the formula, output them. */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in your loan amount: $");
        double loanAmount = input.nextDouble();

        System.out.println("For how many years is this loan?");
        int numOfYears = input.nextInt();

        System.out.println("So then what is the annual interest rate?");
        double annualInterestRate = input.nextDouble();


        double monthlyInterestRate = annualInterestRate / 1200;

        // correct up until this point.

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
        double totalPayment = monthlyPayment * numOfYears * 12;

        //Results
        System.out.println("So the Monthly Payment is gonna be: $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The Total Payment will be: $" + (int)(totalPayment * 100) / 100.0);

        // it's right, its a user error -_-

    }
}
