package com.company;

public class Main {
    public static final int currentPopulation = 312032486;  //a constant population to start breh
    public static void main(String[] args) {
	// GODDAMMIT there are alot of seconds in a year
        int daysInAYear = 365;
        int hoursInAYear = daysInAYear * 24;
        int minutesInAYear = hoursInAYear * 60;
        int secondsInAYear = minutesInAYear * 60; // now we know seconds in a year, goddammit stupid machine.

        //Births in a Year (non rounded, then rounded)
        double birthsInAYear = secondsInAYear/ 7; //rounded
        int birthsInAYearWhole = secondsInAYear/ 7; // Use this to print out that first year.

        //Deaths in a Year (non rounded, then rounded)
        double deathsInAYear = secondsInAYear / 13;
        int deathsInAYearWhole = secondsInAYear /13;

        //Immigrants in a Year (non rounded, then rounded)
        double immigrantsInAYear = secondsInAYear / 45;
        int immigrantsInAYearWhole = secondsInAYear / 45;

        //So now population in a Year! :D yaaaaay (sarcasm)
        // ORDER FUCKING MATTERS, so does good style
        // rounded for da first year breh
        int firstPopulationInAYearWhole = currentPopulation + birthsInAYearWhole - deathsInAYearWhole + immigrantsInAYearWhole;
        double firstPopulationInAYear = currentPopulation + birthsInAYear - deathsInAYear + immigrantsInAYear;

        // don't multiply the initial population again.....
        double secondPopulationInAYear = (firstPopulationInAYear - currentPopulation) * 2 + currentPopulation;
        int secondPopulationInAYearWhole = (int)secondPopulationInAYear;

        double thirdPopulationInAYear = (firstPopulationInAYear - currentPopulation) * 3 + currentPopulation;
        int thirdPopulationInAYearWhole = (int)thirdPopulationInAYear;

        double fourthPopulationInAYear = (firstPopulationInAYearWhole - currentPopulation) * 4 + currentPopulation;
        int fourthPopulationInAYearWhole = (int)fourthPopulationInAYear;

        double fifthPopulationInAYear = (firstPopulationInAYearWhole - currentPopulation) * 5 + currentPopulation;
        int fifthPopulationInAYearWhole = (int)fifthPopulationInAYear;




        //Print out every year for 5 years
        System.out.println("The population of the first year is: " + firstPopulationInAYearWhole);
        System.out.println("The population of the second year is: " + secondPopulationInAYearWhole);
        System.out.println("The population of the third year is: " + thirdPopulationInAYearWhole);
        System.out.println("The population of the fourth year is: " + fourthPopulationInAYearWhole);
        System.out.println("The population of the fifth year is: " + fifthPopulationInAYearWhole);
    }
}
