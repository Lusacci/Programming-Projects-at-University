package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Find the Number of days in a month.
        /*1.) Prompt the user to enter the month and year
          2.) Display the number of days in that month.
          3.) Calculate the number of days in that month.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Hi there! I'll tell you the number of days in the month!");

        System.out.println("Enter in the month 0-12");
        int month = input.nextInt();
        System.out.println("Enter what year that was");
        int year = input.nextInt();

        // This will check if the year is a leap year.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days31 = 31;
        int days30 = 30;
        int days28 = 28;
        int days29 = 29;
        if (isLeapYear){
            switch (month) {
                case 1:  System.out.println("January" + year + "had " + days31 + " days");
                    break;
                case 2:  System.out.println("February " + year + " had " + days29 + " days.");
                    break;
                case 3:  System.out.println("March " + year + " had " + days31 + " days.");
                    break;
                case 4:  System.out.println("April " + year + " had " + days30 + " days.");
                    break;
                case 5:  System.out.println("May " + year + " had " + days31 + " days.");
                    break;
                case 6:  System.out.println("June " + year + " had " + days30 + " days.");
                    break;
                case 7:  System.out.println("July " + year + " had " + days31 + " days.");
                    break;
                case 8:  System.out.println("August " + year + " had " + days31 + " days.");
                    break;
                case 9:  System.out.println("September " + year + " had " + days30 + " days.");
                    break;
                case 10: System.out.println("October " + year + " had " + days31 + " days.");
                    break;
                case 11: System.out.println("November " + year + " had " + days30 + " days.");
                    break;
                case 12: System.out.println("December " + year + " had " + days31 + " days.");
                    break;
            }
        }
        else {
            switch (month) {
                    case 1: System.out.println("January " + year + " had " + days31 + " days.");
                        break;
                    case 2: System.out.println("February " + year + " had " + days28 + " days.");
                        break;
                    case 3: System.out.println("March " + year + " had " + days31 + " days.");
                        break;
                    case 4: System.out.println("April " + year + " had " + days30 + " days.");
                        break;
                    case 5: System.out.println("May " + year + " had " + days31 + " days.");
                        break;
                    case 6: System.out.println("June " + year + " had " + days30 + " days.");
                        break;
                    case 7: System.out.println("July " + year + " had " + days31 + " days.");
                        break;
                    case 8: System.out.println("August " + year + " had " + days31 + " days.");
                        break;
                    case 9: System.out.println("September " + year + " had " + days30 + " days.");
                        break;
                    case 10: System.out.println("October " + year + " had " + days31 + " days.");
                        break;
                    case 11: System.out.println("November " + year + " had " + days30 + " days.");
                        break;
                    case 12: System.out.println("December " + year + " had " + days31 + " days.");
                        break;
        }

    }

    }
}
