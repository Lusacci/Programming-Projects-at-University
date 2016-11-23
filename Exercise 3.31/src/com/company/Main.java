package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Financials: Currency Exchange.
        /*1.) Prompt the user to enter in the exchange rate from currency in U.S dollars to Chinese RMB.
         *2.) Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB to US dollars.
         *3.) Prompt the user to enter the amount in U.S. Dollars or Chinese RMB to convert it to Chinese or U.S. dollars.
         *4.) Display these results.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Hi there I am a program that does currency exchange!");

        System.out.println("Please enter the exchange rate from dollars to RMB: ");
        double exchangeRateDollarsToRMB = input.nextDouble();

        System.out.println("Enter 0 to convert to dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();

        System.out.println("Enter the amount.");
        double amount = input.nextDouble();

        // Since the exchange depends on the choice.

        if(choice == 0) /*First choice, dollars to RMB.*/{
            double exchangedAmount = exchangeRateDollarsToRMB * amount;
            System.out.println("$" + amount + " is " + exchangedAmount + " yuan");
        }
        else if(choice == 1) {
            double exchangedAmount = amount / exchangeRateDollarsToRMB;
            System.out.println(amount + " yuan is $" + exchangedAmount);
        }
        else{
            System.out.println("Incorrect choice input.");
        }

    }
}
