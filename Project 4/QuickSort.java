/*Name: James Tam
Date created or Date last modified: 11/18/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Measures the growth rate of the different sort methods */
public class QuickSort extends BasicSort{
   private int array[];
   private int length;
   
   public QuickSort(){
      super("QuickSort");
   }
   
   @Override
   public void sort(){
      if(data == null || data.length == 0) {
      return;
      }
      this.array = data;
      length = data.length;
      quickSort(0, length-1);
   }
   
   private void quickSort(int lowerIndex, int higherIndex){ 
      int i = lowerIndex;
      int j = higherIndex;
      
      int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
      while(i<=j){
         while(array[i]< pivot){
            i++;
         }
         while(array[j]> pivot){
            j--;
         }
         if(i<=j){
            exchangeNumbers(i,j);
            i++;
            j--;
         }
      }
      
      if(lowerIndex <j){
         quickSort(lowerIndex, j);
         }
      if(i< higherIndex){
         quickSort(i, higherIndex);
         }
 }
 
   private void exchangeNumbers(int i, int j){
      int temp= array[i];
      array[i]= array[j];
      array[j]= temp;
   }
}
      