/*
Name: James Tam
Date created or Date last modified: 8/28/2015
Project info: Prelab Assignment #1
Description: Extend multiple classes through a superclass */
public class Circle extends Shape
{
   private int radius;
   public Circle(){
   }
   public Circle(int x,int y,int radius)
   {
      super(x,y);
      this.radius=radius;
   }
   public void setRadius(int radius){
    this.radius = radius;
   }
   public int getRadius(){
      return radius;
   }
   public void display(){
      System.out.println("Circle" + " x="+ x + " y=" + y +" radius=" + radius);
   }
   public double area(){
      return 3.14*(radius*radius);
   }
}
