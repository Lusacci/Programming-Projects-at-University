package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int kilometers = 14;
        int minutes = 45;
        int seconds = 30;
        double miles = kilometers / 1.6;
        int conversionFromMinutestoSeconds = minutes * 60; //how many minutes in his time converted to seconds
        int totalSeconds = conversionFromMinutestoSeconds + seconds; // total seconds
        double totalSecondsintoHour = (double)totalSeconds / 3600; // so now we know how he ran this time in how much of the hour
        double milesPerHour = miles / totalSecondsintoHour; // divide to find that mph
        System.out.println("Crazy bastard runs at: " + milesPerHour + "mph");


    }
}
