package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Financial Application: calculating tips.
        /* 1.) Prompt the user to enter the subtotal and gratuity rate.
           2.) Compute gratuity and total
           3.) Display results.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings Human! I calculate the gratuity and total in a check!");

        System.out.println("Now let's get down to business, what is your subtotal?");
        double subtotal = input.nextDouble();

        System.out.println("Okay, so now what is your gratuity rate? (What percent?)");
        int gratuity = input.nextInt();

        //Calculate.
        double tip = (gratuity / 100.0) * subtotal;
        double totalBill = tip + subtotal;
        System.out.println("So your gratuity would be:$ " + tip);
        System.out.println("Okay buddy your total will be:$ " + totalBill + " if you decide to tip at: " + gratuity + " %.");
    }
}
