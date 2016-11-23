package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Calculating the offset for GMT
        /*1.) Prompt the user to enter in the number for the offset.
          2.) Calculate the offset in GMT
          3.) Display that time.*/
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
        long currentHours = totalHours % 24;

        //Convert given this.

        currentHours = currentHours +  offset;

        System.out.println("The current time is: " + currentHours + " : " + currentMinutes + " : " + currentSeconds);





    }
}
