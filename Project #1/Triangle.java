/*
Name: James Tam
Date created or Date last modified: 8/28/2015
Project info: Prelab Assignment #1
Description: Extend multiple classes through a superclass */
public class Triangle extends Shape
{
   private int base, height;
   public Triangle(){
   }
   public Triangle(int x, int y, int base, int height){
      super(x,y);
      this.base = base;
      this.height = height;
   }
   public void setBase(int base){
      this.base = base;
   }
   public void setHeight(int height){
      this.height=height;
   }
   public int getBase(){
      return base;
   }
   public int getHeight(){
      return height;
   }
   public void display(){
      System.out.println("Triangle" + " x= " + x + " y=" + y + " base=" + base + " height=" + height);
   }
   public double area(){
      return 0.5 * base * height;
   }
}
   
      