import java.util.*;
public class TheNumberOfYears {
   public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Give me yo minutes man! :D");
   int minutes = input.nextInt();
   int hours = minutes / 60.0;
   int days = hours / 24;
   int years = days / 365;
   double extraDays = days % 365;
   System.out.println(minutes + " minutes is equal to " + years + " years and " + days + " days.");
   

   }
}
      