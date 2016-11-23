/*Name: James Tam
Date created or Date last modified: 11/18/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Measures the growth rate of the different sort methods */
import java.util.Scanner;

public class MergeSort extends BasicSort{
   
   public MergeSort(){
      super("MergeSort");
   }
   
   public void sort(){
      merge_sort(0,data.length-1);
   }
   
   public void merge_sort(int low, int high){
      int mid;
      if(low<high){
         mid = (low + high)/2;
         merge_sort(low,mid);
         merge_sort(mid+1,high);
         merge(low,mid,high);
         }
   }
   
   public void merge(int low, int mid, int high){
      int h,i,j,k;
      int b[] = new int[data.length];
      h=low;
      i=low;
      j=mid+1;
      
      while((h<=mid)&&(j<=high)){
         if(data[h]<=data[j]){
            b[i]=data[h];
            h++;
         }
         else {
            b[i]=data[j];
            j++;
         }
            i++;
      }
      if(h>mid){
         for(k=j;k<=high;k++){
            b[i]=data[k];
            i++;
         }
      }
      else{
         for(k=h;k<=mid;k++){
         b[i]=data[k];
         i++;
         }
      }
      for(k=low;k<=high;k++) {
         data[k]=b[k];
         }
   }
}
            