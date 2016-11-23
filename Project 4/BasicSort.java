/*Name: James Tam
Date created or Date last modified: 11/18/2015
Project info: Project 4 - "Sorting and Complexity"
Description: Measures the growth rate of the different sort methods */
import java.util.*;

abstract class BasicSort {
	protected int[] data;
	protected int[] datacopy;
	protected int size;
	protected Random random;
   protected String sortType;

	public BasicSort(String str) {
		data = null;
		datacopy = null;
		size = 0;
		random = new Random();
      sortType = str;
	}
	public String toString() {
		if (data==null) return "[empty]";
		else {
			StringBuilder result = new StringBuilder("[");
			for (int value: data) result.append(value + " ");
			result.append("]" + "[" + isSorted() + ";" + sameValues() + "]");
			return result.toString();
		}
	}
	public void generate(int sz, int range) {
		//* add code to initialize & generate the data array with random numbers *
      data = new int[sz];
      for(int i = 0; i< sz; i++){
         data[i] = random.nextInt(range);
         }
         copy();  
	}
	public boolean isSorted() {
		// * add code to check if the data array is sorted *
      for(int i = 0; i < data.length-1; i++) {
         if(data[i] > data[i+1]){
         return false;
      }
     }
     return true;
	}
	public boolean sameValues() {
		//* add code to be sure the sorted data contains the same data as the initial array *
      int[] c1= data.clone();
      int[] c2= datacopy.clone();
      Arrays.sort(this.datacopy);
		return Arrays.equals(data,datacopy);
	}
	public void copy() {
		//* add code to copy the data array into the datacopy array *
      datacopy = data.clone();
	}
	public void restore() {
		//* add code to restore the data array with the datacopy array *
      data = datacopy.clone();
	}

	//----------------------------
	// testing
	//----------------------------

	public void simpletest(int size, int range) {
		generate(size,range);		// size = number of values, range = max size of each value
		System.out.println(this);	// print original random values
		sort();				// sort
		System.out.println(this);	// print final sorted values
	}

	public long timedsort() {
		long starttime = System.currentTimeMillis();
		sort();
		long stoptime = System.currentTimeMillis();
		return stoptime-starttime;
	}

	public long[] timedsort(int startsize, int stepsize, int numsteps, int range, boolean print) {
		long[] result = new long[numsteps];
		for (int i=0; i<numsteps; i++) {
			int n = startsize + stepsize*i;
			generate(n, range);
			result[i] = timedsort();
			if (print) System.out.println(String.format("%d: %d",n,result[i]));
		}
		return result;
	}

	public static long[][] timedsort(BasicSort[] sorters, int startsize, int stepsize, int numsteps, int range, boolean print) {
		long[][] result = new long[numsteps][sorters.length];
		for (int i=0; i<numsteps; i++) {
			int n = startsize + stepsize*i;
			if (print) System.out.print(n + ": ");
			for (int k=0; k<sorters.length; k++) {
				BasicSort sorter = sorters[k];
				sorter.generate(n, range);
				result[i][k] = sorter.timedsort();
				if (print) System.out.print(String.format("%d ", result[i][k]));
			}
			System.out.println();
		}
		System.out.println();
		return result;
	}

	public abstract void sort();
}
