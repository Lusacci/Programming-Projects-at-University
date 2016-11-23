package com.company;

public class Main {


    public static void main(String[] args) {
	// Solve 2x2 linear equations (Matrix shit)
        double a,b,c,d,e,f,x,y;

        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = .55;
        e = 44.5;
        f = 5.9;

        //Cramer's Rule

        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d)-(b * c));

        e = (a * x) + (b * y);
        f = (c * x) + (d * y);

        System.out.println("This is x: " + x);
        System.out.println("This is y: " + y);



    }
}
