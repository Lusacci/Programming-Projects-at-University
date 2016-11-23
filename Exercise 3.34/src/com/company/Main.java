package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Geometry: point on line segment.
        Scanner input = new Scanner(System.in);
        System.out.println("Hello I can tell you if your last point is on the left, right, or on the same line " +
                "as the previous 2 points.");

        System.out.println("Please enter the coordinates (x,y) of the first point. ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();

        System.out.println("Please enter the coordinates (x,y) of the second point. ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Please enter the coordinates (x,y) of the last point. ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        String p0 = "(" + x0 + ", " + y0 + ")";
        String p1 = "(" + x1 + ", " + y1 + ")";
        String p2 = "(" + x2 + ", " + y2 + ")";

        String s = " not ";

        // checking if the point is in range
        if (((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1))
                && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1))) {
            double c = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
            if (c == 0) {
                s = " ";
            }
        }

        System.out.println(p2 + "is" + s + "on the line segment from " + p0
                + " to " + p1);

    }
}
