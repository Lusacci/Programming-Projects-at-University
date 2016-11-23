package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Cost of shipping
        /*1.) Prompt the user to enter the weight of the package
          2.) Calculate the shipping cost - weight above 50, display package cannot be shipped.
          3.) Display the shipping cost.*/
        Scanner input = new Scanner(System.in);
        System.out.println("I calculate the user shipping cost! Enter the weight of the package (pounds)!");
        double userWeight = input.nextDouble();
        double costPerWeight;
        if (userWeight <= 1){
            costPerWeight = 3.5 * userWeight;
            System.out.println("The shipping cost is: $" + costPerWeight);
        }
        else if (userWeight <= 3) {
            costPerWeight = 5.5 * userWeight;
            System.out.println("The shipping cost is: $" + costPerWeight);
        }
        else if (userWeight <= 10) {
            costPerWeight = 8.5 * userWeight;
            System.out.println("The shipping cost is: $" + costPerWeight);
        }
        else if (userWeight <= 20){
            costPerWeight = 10.5 * userWeight;
            System.out.println("The shipping cost is: $" + costPerWeight);
        }
        else if (userWeight < 50) {
            System.out.println("The package cannot be shipped.");
        }
        else {
            costPerWeight = 10.5 * userWeight;
            System.out.println("The shipping cost is: $" + costPerWeight);
        }


    }
}
