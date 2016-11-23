package com.company;
import java.util.Scanner;
public class Main {
    public static final int currentPopulation = 312032486;
    public static void main(String[] args) {
	// Population Projection
        /*1.) Prompt the user for the number of years.
          2.) Take the population exercise and calculate that from exercise 1.11
          3.) Display that population. */
        Scanner input = new Scanner(System.in);
        System.out.println("Hello I calculate the population projection.");
        System.out.println("For how many years is this population going to grow?");
        int years = input.nextInt();

        //Conversions of seconds into a year.
        int daysInAYear = 365;
        int hoursInAYear = daysInAYear * 24;
        int minutesInAYear = hoursInAYear * 60;
        int secondsInAYear = minutesInAYear * 60; // now we know seconds in a year, goddammit stupid machine.

        //Births in a Year (non rounded, then rounded)
        double birthsInAYear = secondsInAYear / 7; //rounded
        double birthsInAYearPrompted = birthsInAYear * years;

        //Deaths in a Year (non rounded, then rounded)
        double deathsInAYear = secondsInAYear / 13;
        double deathsInAYearPrompted = deathsInAYear * years;

        //Immigrants in a Year (non rounded, then rounded)
        double immigrantsInAYear = secondsInAYear / 45;
        double immigrantsInAYearPrompted = immigrantsInAYear * years;

        int population = currentPopulation + (int)birthsInAYearPrompted - (int)deathsInAYearPrompted + (int)immigrantsInAYearPrompted;
        //Display Results to test.
        System.out.println("The population is: " + population);

    }
}
