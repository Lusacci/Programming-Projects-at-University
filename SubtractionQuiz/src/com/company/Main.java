package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Subtraction Quiz
        Scanner input = new Scanner(System.in);

        //Generating 2 random integers.
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        if (num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //prompt
        System.out.println("Hello Human, I am subtraction quiz bot.");
        System.out.println("So what is " + num1 + " - " + num2 + " ?");
        int answer = input.nextInt();

        if(num1 - num2 == answer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("Sorry that's wrong.");
            System.out.println("The answer actually is: " + (num1 - num2));
        }
    }
}
