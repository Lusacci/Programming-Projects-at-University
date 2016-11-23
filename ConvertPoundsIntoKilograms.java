import java.util.*;
public class ConvertPoundsIntoKilograms {
   public static void main(String [] args) {
   Scanner input = new Scanner (System.in);
   System.out.println("Please enter in a value for pounds!");
   double pounds = input.nextDouble();
   
   double kilograms = pounds * .454;
   
   System.out.println("So the given pounds in kilograms is: " + kilograms);
   }
}
   