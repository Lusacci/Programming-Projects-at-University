/*Name: James Tam
Date created or Date last modified: 11/18/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Measures the growth rate of the different sort methods */
public class Project4{
   
   public static void main(String [] args) {
      BasicSort [] sort = {new BubbleSort(), new SelectionSort(), new InsertSort(), new MergeSort(), new QuickSort(), new HeapSort()};
      System.out.println("Size : Bubble, Selection, Insert, Merge, Quick, HeapSort");
      BasicSort.timedsort(sort, 10000, 1000, 10, 10, true);
   }
}