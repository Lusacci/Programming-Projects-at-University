package com.company;

public class Main {

    public static void main(String[] args) {
	// Calculating the Area of a Circle.
        /*Step One : Declaring the Variables
          Step Two: Assigning a radius
          Step Three: calculate the area
          Step Four: print out the value of area.
         */
        double area, pi;
        pi = 3.14159;
        int radius = 30;
        area = radius * radius * pi;
        System.out.println("The Area is: " + area);
    }
}
