package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Current time
        /*Revise Programming exercise 2.8 to display the hour using a 12-hour clock. */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in the number for the offset.");
        int offset = input.nextInt();

        // Please calculate the GMT here.
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours % 24) - 12;

        //Convert given this.

        currentHours = currentHours +  offset;


        System.out.println("The current time is: " + currentHours + " : " + currentMinutes + " : " + currentSeconds);


    }
}
