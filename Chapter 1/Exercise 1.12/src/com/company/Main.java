package com.company;

public class Main {

    public static void main(String[] args) {
	// Average speed in kilometers


        // convert those miles to kilometers.
        int miles = 24;
        double kilometers = miles * 1.6;

        // convertions from seconds to hours.
        int runnerHoursToMinutes = 1 * 60;
        int runnerTheseMinutesToSeconds = runnerHoursToMinutes * 60;
        int runnerMinutes = 40;
        int runnerMinutesToSeconds = 40 * 60;
        int runnerSeconds = 35;
        int runnerTotalSeconds = runnerTheseMinutesToSeconds+ runnerMinutesToSeconds + runnerSeconds;

        /* runnerTotalSeconds / kilometers  = 3600/ n */


        //So now we have kilometers to total seconds. Calculating rate now.
        double kilometersPerHour = (kilometers * 3600) / runnerTotalSeconds;

        //Wrap it up
        System.out.println("The Runner's time is: " + kilometersPerHour + " kph");




    }
}
