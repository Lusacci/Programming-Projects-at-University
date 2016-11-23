package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Checking Palindromes
        /*1.) Prompt the user to enter a three digit integer number.
          2.) Check Palindrome
          3.) Print t/f if palindrome or not.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Hello Human! Please enter a 3 digit integer number!");
        int userNum = input.nextInt();

        // After getting user number, it's time to isolate digits.
        int digit1 = userNum / 100; //ex 323/100 = 3
        int moveSpot = userNum % 100; // ex 323 % 100 = 23
        int digit2 = moveSpot / 10; // ex 23 / 10 = 2
        int digit3 = moveSpot % 10; // 23 % 10 = 3

        // So now we have all our digits, it's time to check and compare
        if (userNum > 999) {
           System.out.println("Sorry that's an invalid number.");
        }
        else {
            if (digit1 != digit3){
                System.out.println(userNum + " is not a palindrome.");
            }
            else{
                System.out.println(userNum + " is a palindrome.");
            }
        }
    }
}
