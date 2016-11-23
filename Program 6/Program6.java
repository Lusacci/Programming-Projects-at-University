import java.util.Scanner;
public class Program6
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.println("Hey, please enter a value for Radius!");
   double radius = input.nextDouble();
   System.out.println("Now enter one for length!");
   double length = input.nextDouble();
   double area, volume;
   area = radius * radius * 3.14159; // this is pi
   volume = area * length;
   System.out.println("So your area comes out to: " + area + " given a radius of " + radius + " and a length of " + length);
   System.out.println("Your volume is also going to be: " + volume);
   
   }
}