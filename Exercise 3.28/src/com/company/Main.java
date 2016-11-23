package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Geometry: 2 rectangles
        /*1.) Prompt the user to enter the x, y coordinates and width and height of the first rectangle.
          2.) Prompt the user to enter the x, y coordinates and width and height of the second rectangle.
          3.) Determine if 2nd rectangle overlaps with the first or is inside the first.
          4.) Display those results.*/

        System.out.println("I'm a program that will tell you if rectangle 2 is inside, overlapping, or not overlapping rectangle 1.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x-, y-coordinates,width, and height: ");
        System.out.println("Enter r2's center x-, y-coordinates,width, and height: ");

        //rectangle 1
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        // rectangle 2
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        // 1st case, check r2 inside r1, next case r2 overlaps r1, last case r2 doesn't overlap r1.
        // Find left, right, top, and bottom per rectangle.

        //r1 coordinates.
        double r1left = x1 - (width1/2);
        double r1right = x1 + (width1/2);
        double r1top = y1 + (height1/2);
        double r1bot = y1 - (height1/2);

        //r2 coordinates.
        double r2left = x2 - (width2/2);
        double r2right = x2 + (width2/2);
        double r2top = y2 + (height2/2);
        double r2bot = y2 - (height2/2);

        // test if r2 is inside r1.
        if ((r2left >= r1left) && (r2top <= r1top) && (r2right <= r1right) && (r2bot >= r1bot)) {
            System.out.println("r2 is inside of r1.");
        }
        // test if r2 overlaps r1.
        else if ((((r2left <= r1right) && (r2left >= r1left)) && ((r2top > r1top) || (r2bot < r1bot) || (r2right > r1right))) ||
                (((r2right >= r1left) && (r2right <= r1right)) && ((r2top > r1top) || (r2bot < r1bot) || (r2left < r1left)))  ||
                (((r2top >= r1bot) && (r2top <= r1top)) && ((r2right > r1right) || (r2bot < r1bot) || (r2left < r1left)))  ||
                (((r2bot <= r1top) && (r2bot >= r1bot)) && ((r2top > r1top) || (r2right > r1right) || (r2left < r1left)))
                )
        {
            System.out.println("r2 overlaps r1.");
        }
        // last case when r2 doesn't overlap r1.
        else{
            System.out.println("r2 does not overlap r1.");
        }











    }
}
