package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Geometry: points in a triangle?
        /*1.) Prompt the user to enter a point in the triangle (x,y)
          2.) Check if it is inside the triangle
          3.) Display that result.*/
        Scanner input = new Scanner (System.in);
        System.out.println("Hey there, give me a coordinate and I'll tell you if it's in the triangle! x first then y please.");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ((x >= 0 && x <= 200) && (y >= 0 && y <= 100)){
            System.out.println("The point is in the triangle.");
        }
        else{
            System.out.println("The point is not in the triangle.");
        }

    }
}
