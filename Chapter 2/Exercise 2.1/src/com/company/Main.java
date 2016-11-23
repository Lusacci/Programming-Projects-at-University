package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Convert Celsius to Fahrenheit

        /* Instructions (Functionality)
           1.) Read a Celsius Defree in a double value from the console.
           2.) Converts it to Fahrenheit
           3.) Displays the result
         */

        //Prompt, store input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value in Celsius.");
        double celsiusInput = input.nextDouble();

        // convert this into Fahrenheit.
        double fahrenheit = (9.0 / 5) * celsiusInput + 32;

        //time to output something to the user.
        System.out.println(celsiusInput + " Celsius is: " + fahrenheit + " fahrenheit. ");
    }
}
