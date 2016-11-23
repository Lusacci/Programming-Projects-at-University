package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Convert feet into meters.
        /*1.) Prompt user for feet.
          2.) Convert that input into meters. (1 foot is .305 meters)
          3.) Display that result.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many feet: ");
        double feet = input.nextDouble();
        //convert to meters
        double meters = feet * .305;

        //display these results.
        System.out.println("So " + feet + " feet is " + meters + " meters.");







    }
}
