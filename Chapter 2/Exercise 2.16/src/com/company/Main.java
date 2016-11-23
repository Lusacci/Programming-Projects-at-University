package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Geometry: area of a hexagon
        /*1.)Prompt the user to enter the a side of the hexagon.
          2.)Compute the Area
          3.) Display the Area*/
        Scanner input = new Scanner(System.in);
        System.out.println("Hello I calculate the area of a hexagon");
        System.out.println("Please give me a side of the hexagon!");
        double side = input.nextDouble();

        //Calculate
        double area = (3 * (Math.pow(3, .5)) / 2) * (Math.pow(side, 2));
        System.out.println("The area of the hexagon is: " + area);
    }
}
