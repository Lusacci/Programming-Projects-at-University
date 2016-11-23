public class AverageSpeenInMiles {
   public static void main(String [] args){
   double kilometers = 14.0;
   double secondsInMinutes;
   double seconds = 30.0;
   
   secondsInMinutes = seconds / 60.0; //convert my given seconds into minutes
   
   double myMinutes = 45.0;
   double totalMinutes;
   
   totalMinutes = myMinutes + secondsInMinutes; // add my converted seconds to minutes with the minutes I already have
   
   double miles;
   
   miles = kilometers / 1.6; // this is the distance in miles
   
   double myTimeInHours;
   
   myTimeInHours = totalMinutes / 60.0; // this will convert the total time calculated into hours.
   
   double milesConverted;
   
   milesConverted = miles / myTimeInHours;
   
   System.out.println("So your average speed, given kilometers, minutes and seconds, comes out to: " + milesConverted + " miles per hour"); 
   }
}
    
   