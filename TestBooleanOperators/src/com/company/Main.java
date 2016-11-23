package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Test Boolean Operators
        Scanner input = new Scanner(System.in);

        //Receive this as an input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        }

        if(number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
        }
        if(number % 2 == 0 ^ number % 3 == 0){
            System.out.println(number + " is divisible by 2 or 3, but not both.");
        }
    }
}
