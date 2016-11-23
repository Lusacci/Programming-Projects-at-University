package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    // Calculate the area of a Circle with console input
        Scanner input = new Scanner(System.in);

        System.out.println("Okay so what do you want your radius to be?");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;
        System.out.println("The Area of the circle is: " + area);
    }
}
