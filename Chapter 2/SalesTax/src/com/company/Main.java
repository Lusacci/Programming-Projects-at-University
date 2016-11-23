package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// This code will calculate Sales tax for you! :D
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the total Bill please! (no dollar sign)");
        double totalBill = input.nextDouble();

        double tax = totalBill * .06;
        System.out.println("Sales tax is going to be: $" + (int)(tax * 100)/ 100.0);

    }
}
