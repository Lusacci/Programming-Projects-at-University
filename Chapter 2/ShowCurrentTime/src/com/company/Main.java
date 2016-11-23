package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        

        System.out.println("The Current Time is: " + currentHours + " : " + currentMinutes + " : " + currentSeconds
        + " GMT");

    }
}
