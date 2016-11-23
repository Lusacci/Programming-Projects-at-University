package com.company;

public class Main {

    public static void main(String[] args) {
	// Random point
        /*1.) Random coordinate in a rectangle (so random width, and a random height)
          2.) Rectangle specs are 100 width and 200 height (max 100 and max 200).
          3.) Center is (0,0) (makes things easy, no Math.ceil)  */

        int randwidth = (int)(Math.random() * 100);
        int randheight = (int)(Math.random() * 200);

        System.out.println("Hey so I'll give ya a random point on this rectangle! (" + randwidth + "," + randheight + "), here ya go!");

    }
}
