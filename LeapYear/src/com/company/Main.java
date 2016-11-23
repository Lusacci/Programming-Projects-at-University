package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Determining the Leap Year
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        // This will check if the year is a leap year.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //Display it.
        System.out.println( year + " is a leap year? " + isLeapYear);
    }
}
