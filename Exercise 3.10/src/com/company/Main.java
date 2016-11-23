package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Game: Addition Quiz
        /*1.) Past the Subtraction Quiz code
          2.) Change it to randomly generate an addition quiz with two integers less than 100.*/

        Scanner input = new Scanner(System.in);

        //Generating 2 random integers.
        int num1 = (int)(Math.ceil(Math.random() * 99));
        int num2 = (int)(Math.ceil(Math.random() * 99));

        //prompt
        System.out.println("Hello Human, I am subtraction quiz bot.");
        System.out.println("So what is " + num1 + " + " + num2 + " ?");
        int answer = input.nextInt();

        if(num1 + num2 == answer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("Sorry that's wrong.");
            System.out.println("The answer actually is: " + (num1 + num2));
        }
    }
}
