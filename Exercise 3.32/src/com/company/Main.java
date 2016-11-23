package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Geometry: point position
        /*1.) Prompt the user to enter the coordinates of 3 points.
         *2.) Display whether p2 is on the left of the line from p0 to p1, on the right, or on the same line. */
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

        double lineFormula = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));

        if (lineFormula > 0) {
            System.out.println("(" + x2 + "," + y2 + ")" + "is on the left side of the line from (" + x0
            + "," + y0 + ") to (" + x1 + "," + y1 + ").");
        }
        else if(lineFormula == 0) {
            System.out.println("(" + x2 + "," + y2 + ")" + "is on the same line from (" + x0
                    + "," + y0 + ") to (" + x1 + "," + y1 + ").");
        }
        else {
            System.out.println("(" + x2 + "," + y2 + ")" + "is on the right side of the line from (" + x0
                    + "," + y0 + ") to (" + x1 + "," + y1 + ").");
        }

    }
}
