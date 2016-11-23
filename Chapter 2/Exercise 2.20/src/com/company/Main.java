package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Financial Application: Calculate Interest
        /*1.) Prompt the balance and annual percentage rate
          2.) Calculate the interest
          3.) Display the interest rate. */
        Scanner input = new Scanner(System.in);
        System.out.println("I will calculate the interest for you!");
        System.out.println("Please give me the balance: $");
        double balance = input.nextDouble();

        System.out.println("Now give me the annual percentage interest rate");
        double annualInterest = input.nextDouble();

        double interestMonthly = balance * (annualInterest / 1200);

        System.out.println("The interest is: " + interestMonthly);


    }
}
