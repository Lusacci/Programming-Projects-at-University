import java.util.*;
public class ConvertFeetIntoMeters {
   public static void main(String [] args) {
   Scanner input = new Scanner (System.in);
   System.out.println("Please give me a value in feet: ");
   int feet = input.nextInt();
   double meters;
   
   meters = feet * .305;
   
   System.out.println("So your value in feet converted to meters comes out to: " + meters + " meters.");
   }
}

   