/*Name: James Tam
Date created or Date last modified: 11/18/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Measures the growth rate of the different sort methods */
public class HeapSort extends BasicSort{  
    private static int N;
    public HeapSort() {  
      super("HeapSort");
    }
    
    @Override
    /* Sort Function */
    public void sort()
    {       
        heapify(data);        
        for (int i = N; i > 0; i--)
        {
            swap(data,0, i);
            N = N-1;
            maxheap(data, 0);
        }
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    
}
