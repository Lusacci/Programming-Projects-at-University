/*
Name: James Tam
Date created or Date last modified: 8/28/2015
Project info: Prelab Assignment #1
Description: Extend multiple classes through a superclass */
public abstract class Shape {  // this cannot be instantiated, purpose is to extend in other classes.
   int x, y; //x and y coordinate    
   public Shape(int x,int y){
      this.x=x;
      this.y=y;   
   }
   public Shape()
   {
      
   }
   
   public void setX(int newX){ // set X
    x = newX; //stores this newX into x.
   }
   
   public void setY(int newY){ // set y
    y = newY; // stores this newY into y.
   }
   
   public int getX(){ // get X
    return x; // retrieves the value stored in x, given the parameter x.
   }

   public int getY(){ // get y
    return y; // retrieves the value stored in y, given the parameter y.
   }
   
   
   public abstract void display();
   public abstract double area();
    
   
}
