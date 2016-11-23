package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Sort 3 integers
        /* 1.) Prompt the user to display 3 integers
           2.) Display integers in non-decreasing order */

        //Prompt
        Scanner input = new Scanner(System.in);
        System.out.println("What's good human? I'll always show the decreasing order of 3 integers ya put in.");
        System.out.println("Why don't you give me those 3 numbers baby boo?");
        System.out.println("Enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int temp; // use this to swap numbers.

        //Now if else dat stuff!
        if (num1 >= num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
            if (num2 >= num3){
                temp = num2;
                num2 = num3;
                num3 = temp;
                if(num1 >= num2){
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
            }
        }
        else {
             if (num2 >= num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
                 if(num1 >= num2){
                     temp = num1;
                     num1 = num2;
                     num2 = temp;
                 }
             }
             else if (num1 >= num3){
                 temp = num1;
                 num1 = num3;
                 num3 = temp;
             }
        }
        System.out.println(num1+ " " + num2 + " "+ num3 + " "); // so here num1 smallest, num2 2nd smallest, num 3 biggest.

    }
}
