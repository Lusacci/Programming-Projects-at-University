public class PopulationInTheNext5Years {
   public static void main(String [] args){
   int currentPopulation = 312032486;
   int births;
   int deaths;
   int newImmigrants;
   
   int hoursInAYear;
   int minutesInAYear;
   int secondsInAYear;
   
   hoursInAYear = 365 * 24;
   minutesInAYear = hoursInAYear * 60;
   secondsInAYear = minutesInAYear * 60;
   
   births = secondsInAYear / 7;
   deaths = secondsInAYear / 13;
   newImmigrants = secondsInAYear / 45;
   
   int currentPopulationYearOne = births - deaths + newImmigrants + currentPopulation;
   int currentPopulationYearTwo = currentPopulation + 2*(births - deaths + newImmigrants);
   int currentPopulationYearThree = currentPopulation + 3*(births - deaths + newImmigrants);
   int currentPopulationYearFour = currentPopulation + 4*(births - deaths + newImmigrants);
   int currentPopulationYearFive = currentPopulation + 5*(births - deaths +newImmigrants);
   
   System.out.println("So right now, our Current Population is: " + currentPopulation);
   System.out.println("One year later, the population will be: " + currentPopulationYearOne);
   System.out.println("Two years later, the population will jump to: " + currentPopulationYearTwo);
   System.out.println("Three years later, the population will goto: " + currentPopulationYearThree);
   System.out.println("Then in year 4, the population will be: " + currentPopulationYearFour);
   System.out.println("Then lastly, at the 5th year, the population will be: " + currentPopulationYearFive);
   
   
   
   
   
   
   }
}