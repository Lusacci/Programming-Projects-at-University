package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Science: day of the week - Zeller's congruence algorithm.
        /*1.) Prompt the user to enter a year, a month, and a day of the month.
          2.) Calculate day of the week
          3.) Display that day of the week.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Hello! I will predict the day of the week using Zeller's");
        System.out.println("Please enter in a year, month, and day of the month (1-31).");
        int year  = input.nextInt();
        int m = input.nextInt();
        int q = input.nextInt();


        if (m == 1 || m == 2){
            m += 12;
            year -= 1;
        }

        // Calculate the components used in Zeller's
        int j = year / 100; // this is century
        int k = year % 100; // this is year of the century

        //Zeller's
        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        System.out.println(h);


        switch (h) {
            case 0:
                System.out.println("Day of the week is Saturday.");
                break;
            case 1:
                System.out.println("Day of the week is Sunday.");
                break;
            case 2:
                System.out.println("Day of the week is Monday.");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday.");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday.");
                break;
            case 5:
                System.out.println("Day of the week is Thursday.");
                break;
            case 6:
                System.out.println("Day of the week is Friday.");
                break;
        }




    }
}
