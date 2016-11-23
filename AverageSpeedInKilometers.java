public class AverageSpeedInKilometers {
   public static void main(String [] args) {
   double runnerMiles = 24.0;
   double runnerHour = 1.0;
   double runnerMin = 40.0;
   double runnerSec = 35.0;
   
   double conversionMin = runnerHour * 60.0; //converting the hours to minutes
   double conversionSec = 60.0 * (conversionMin + runnerMin); //totaling up this, conversion from minutes + runner minutes and placing it into conversion seconds.
   double totalTimeInSecondsForRunner = conversionSec + runnerSec; // now we know how many seconds for the 24 miles.
   
   double runnerKilometers = runnerMiles * 1.6;
   
   double AverageSpeed = (runnerKilometers * 60 * 60) / totalTimeInSecondsForRunner;
   
   System.out.println("So at 24 miles at 1 hour, 40 minutes, and 35 seconds, the new Average come out to: " + AverageSpeed + " km per hour.");
   }
} 
   
   