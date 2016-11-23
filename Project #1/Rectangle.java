/*
Name: James Tam
Date created or Date last modified: 8/28/2015
Project info: Prelab Assignment #1
Description: Extend multiple classes through a superclass */
public class Rectangle extends Shape
{
   private int width, height;
   public Rectangle(){
   }
   public Rectangle(int x, int y, int width, int height)
   {
      super(x,y);
      this.width=width;
      this.height=height;
   }
   public void setWidth(int width){
      this.width=width;
   }
   public void setHeight(int height){
      this.height=height;
   }
   public int getWidth(){
      return width;
   }
   public int getHeight(){
      return height;
   }
   public void display(){
      System.out.println("Rectangle" + " x= " + x + " y=" + y + " width=" + width + " height=" + height);
   }
   public double area(){
      return (double) width * height;
   }
}   
