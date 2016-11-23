package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Compute the perimeter of a triangle
        /*1.) Read 3 edges for a triangle, I'm guessing prompt.
          2.) Compute the perimeter if the input is valid.
          3.) Display if invalid.
          4.) Only valid if the sum of every 2 pair or 2 edges is greater than the remaining edge.*/


        // Read the 3 sides.
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me values for the 3 sides of a triangle, invalid if the sum of 2 sides is not bigger than the last one.");
        System.out.println("First side please.");
        double edge1 = input.nextDouble();
        System.out.println("Second side please.");
        double edge2 = input.nextDouble();
        System.out.println("Third side please.");
        double edge3 = input.nextDouble();

        boolean valid; // gonna declare here.

        if(((edge1 + edge2) > edge3) || ((edge2 + edge3) > edge1) || ((edge1 + edge3) > edge2)  ){
            valid = true;
        }
        else{
            valid = false;
        }

        if (valid) {
            //This is perimeter
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("So given all the edges, the perimeter is: " + perimeter);
        }
        else {
            System.out.println("Sorry but that input is invalid.");
        }


        // may need 2 loops, 1 for valid/invalid, other for perimeter. I'd suggest nesting it.




    }
}
