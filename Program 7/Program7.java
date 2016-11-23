import java.util.Scanner;
public class Program7
{
   public static void main(String[] args) 
   {
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter a value for feet!");
   double feet = input.nextDouble();
   double meters;
   meters = feet / .305;
   System.out.println("Given the foot, the measurement is: " + meters + " meters ");
   }
}