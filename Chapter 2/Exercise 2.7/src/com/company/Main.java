package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Find the number of years
        /*1.) Prompt the user to enter minutes
          2.) Convert to years and days
          3.) Display Results*/

        Scanner input = new Scanner(System.in);
        System.out.println("If ya give me minutes, I'll tell ya how many years, days, and hours it is man!");
        System.out.println("Why dontcha gimme how many minutes to convert! :D");
        int minutes = input.nextInt();

        //Convert here.
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int days = hours / 24;
        int years = days / 365;
        int remainingdays = days % 365;

        //Display
        System.out.println("So your time comes out to: " + years + " years " + remainingdays + " days ");
    }
}
