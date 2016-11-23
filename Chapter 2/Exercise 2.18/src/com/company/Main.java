package com.company;

public class Main {

    public static void main(String[] args) {
	// Print a table
        /*1.) Create the titles for the table
          2.) Values for a and b
          3.) Calculate a^b
          4.) Display the table */



        int a, b, powAB;
        b = 2;
        System.out.println("a    b    pow(a, b)");
        for (a = 1; a < 6; a++) {
                powAB = (int)Math.pow(a, b);
                System.out.println(a + "    " + b + "    " + powAB);
                b++;
        }


    }
}
