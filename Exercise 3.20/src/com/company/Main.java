package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Science: Wind-chill temperature.
        /*Take the code from exercise 2.17
          1.) Prompt the user to enter a temperature and windspeed.
          2.) invalid/valid
          3.) display. */

            /*1.) Prompt the user to enter a temperature between -58 to 41 degrees fahrenheit
              2.) Prompt the wind speed (>=2) in miles per hour:
              3.) Calculate the wind chill index
              4.) Display this value */

        boolean valid;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello I calculate the wind-chill temperature index!");
        System.out.println("Please give me a temperature between -58 to 41 degrees fahrenheit.: ");
        double temp  = input.nextDouble();

        System.out.println("Now give me a wind speed (>=2) in miles per hour.: ");
        double windSpeed = input.nextDouble();

        if ((temp < -58 || temp > 41) && (windSpeed) < 2) {
            valid = true;
        }
        else {
            valid = false;
        }
        if (valid) {
            double windChillIndex = 35.74 + (.6215 * temp) - (35.75 * (Math.pow(windSpeed, 0.16)))
                    + (.4275 * temp * (Math.pow(windSpeed, .16)));
            System.out.println("So the wind chill index is: " + windChillIndex);
        }
        else {
            System.out.println("Sorry, but the values for temp or windspeed is invalid.");
        }
    }
}
