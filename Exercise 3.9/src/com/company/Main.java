package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Check ISBN
        /*1.) Prompt user to enter first 9 digits of ISBN.
          2.) Extract each digit from this 9 digit number.
          3.) Calculate the 10th digit.
          3.) display full isbn*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first 9 digits of ISBN");
        int isbn = input.nextInt();

        //Get each digit of isbn. LMFAO XD hahaha
        int d1 = isbn / 100000000;
        int shrinkage1 = isbn % 100000000;
        int d2 = shrinkage1 / 10000000;
        int shrinkage2 = shrinkage1 % 10000000;
        int d3 = shrinkage2 / 1000000;
        int shrinkage3 = shrinkage2 % 1000000;
        int d4 = shrinkage3 / 100000;
        int shrinkage4 = shrinkage3 % 100000;
        int d5 = shrinkage4 / 10000;
        int shrinkage5 = shrinkage4 % 10000;
        int d6 = shrinkage5 / 1000;
        int shrinkage6 = shrinkage5 % 1000;
        int d7 = shrinkage6 / 100;
        int shrinkage7 = shrinkage6 % 100;
        int d8 = shrinkage7 / 10;
        int d9 = shrinkage7 % 10;

        int d10 = ((d1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
        if (d10 == 10){
            System.out.println("The ISBN-10 number is: " + isbn + "X");
        }
        else {
            System.out.println("The ISBN-10 number is: " + isbn + d10);
        }
    }
}
