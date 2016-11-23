package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Use the &&, ||, and ^ operators.
        /*1.)Prompt the user to enter an integer
          2.)Determine whether it is divisible by 5 and 6, 5 or 6, and 5 or 6 but not both.
          3.)Display these results.*/

        Scanner input = new Scanner (System.in);
        System.out.println("Enter an integer, I'll tell you if it's divisible by 5 and 6, 5 or 6, and 5 or 6 but not both.");
        int userNum = input.nextInt();
        boolean response1, response2, response3;

        if((userNum % 5 == 0) && (userNum % 6 == 0)) {
            response1 = true;
            response2 = true;
            response3 = false;
        }
        else if((userNum % 5 == 0) || (userNum % 6 == 0)) {
            response1 = false;
            response2 = true;
            if((userNum % 5 == 0) ^ (userNum % 6 == 0)) {
                response3 = true;
            }
            else {
                response3 = false;
            }
        }
        else{
            response1 = false;
            response2 = false;
            response3 = false;
            System.out.println("Invalid input, please try again.");
        }
        System.out.println("Is your number divisible by 5 and 6? " + response1);
        System.out.println("Is your number divisible by 5 or 6? " + response2);
        System.out.println("Is your number divisible by 5 or 6 but not both? " + response3);
    }
}
