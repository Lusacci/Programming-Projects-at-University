import java.util.*;
public class ConvertCelisiusToDegree {
   public static void main(String []args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter a value for the Celsius!!!!");
   
   double Celsius = input.nextDouble();
   
   double Fahrenheit;
   
   Fahrenheit = (9.0/5) * Celsius + 32;
   
   System.out.println("So the temperature in Fahrenheit given your celsius " + Celsius + " is " + Fahrenheit + " degrees.");
   
   }
}
   