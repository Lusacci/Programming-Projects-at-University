/*Name: James Tam
Date created or Date last modified: 11/18/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Measures the growth rate of the different sort methods */
public class InsertSort extends BasicSort{
   
   public InsertSort(){
      super("InsertSort");
   }
   
   @Override
   public void sort(){
      int i,j, newValue;
      for(i=1; i< data.length; i++){
         newValue = data[i];
         j=i;
         while(j>0 && data[j-1] > newValue) {
            data[j] = data [j-1];
            j--;
         }
         data[j] = newValue;
      }
    }
    
}