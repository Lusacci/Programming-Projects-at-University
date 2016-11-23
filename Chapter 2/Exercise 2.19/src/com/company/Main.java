package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Geometry: area of a triangle
        /*1.) Prompt the user to enter 3 points
          2.) Compute the area of the triangle
          3.) Display the area of the triangle. */

        Scanner input = new Scanner(System.in);
        System.out.println("Hello Human, I will calculate the area of a triangle");

        System.out.println("Enter in x1 and y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter in x2 and y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter in x3 and y3");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double innerDistance1 = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double side1 = Math.pow(innerDistance1, .5);

        double innerDistance2 = Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2);
        double side2 = Math.pow(innerDistance2, .5);

        double innerDistance3 = Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2);
        double side3 = Math.pow(innerDistance3, .5);

        double s = (side1 + side2 + side3) / 2;
        double innerArea = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.pow(innerArea, .5);

        System.out.println("The area of the triangle is: " + area);
    }
}
