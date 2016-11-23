package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Geometry: intersecting point
        /* 1.) Prompt the user to enter 4 points
           2.) Display the intersecting point.*/
        //Highly suggest extending Cramer's rule.

        double inf = Double.POSITIVE_INFINITY;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! I show the intersection point if ya give me 4 of em!");
        System.out.println("So how's about you give me the first point? (x,y) x first, y next.");
        double x1 = input.nextDouble();
        double y1= input.nextDouble();
        System.out.println("So how's about you give me the second point? (x,y) x first, y next.");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("So how's about you give me the third point? (x,y) x first, y next.");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.println("So how's about you give me the fourth point? (x,y) x first, y next.");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Now we have all the points, let's simplify before we solve.
        double store1 = (y1 - y2);
        double store2 = (x1 - x2);
        double store3 = (y3 - y4);
        double store4 = (x3 - x4);


        //Getting there!
        double c,d,x,y;

        // READ THE FORMULA CAREFULLY NEXT TIME.

        c = (store1 * x1) - (store2 * y1);
        d = (store3 * x3) - (store4 * y3);

        // Okay! Now use Cramer's rule to the dot.
        x = ((c * store4) - (store2 * d)) / ((store1 * store4) - (store2 * store3));
        y = ((store1 * d) - (c * store3)) / ((store1 * store4) - (store2 * store3));

        // Holy crap that was annoying to figure out.

        if(x == inf){
            System.out.println("The two lines are parallel.");
        }
        else {
            System.out.println("The intersecting point is at (" + x + "," + -y + ")." );
        }



    }
}
