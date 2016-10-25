package arrays;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
    	
    	/*double[] array = {(double)(int)(Math.random()*500), 
    			(double)(int)(Math.random()*500), 
    			(double)(int)(Math.random()*500), 
    			(double)(int)(Math.random()*500), 
    			(double)(int)(Math.random()*500), 
    			(double)(int)(Math.random()*500), 
    			(double)(int)(Math.random()*500)};
    	getStats(array);*/
    	
    	int[] array1 = {1, 2, 3, 4, 5, 6};
    	int[] array2 = {1, 2, 5, 4, 1, 6};
    	countDifferences(array1, array2);
    	
    	//System.out.println(Arrays.toString(array));
    	//getStats(array);
    	
     /**
      * IMPORTANT NOTE: 
      * This homework assignment will be weighted 4x.
      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
      * DO NOT spend hours and hours trying to fix perfect code just because my test
      * says that it isn't perfect!
      * */
    }
    
    //DONE
    public static int searchUnsorted(int[] arrayToSearch, int key){
    
    	for(int i = 0; i < arrayToSearch.length; i++){
    		if(arrayToSearch[i] == key){
    			return i;
    		}
    	}
    	
    /**
     * this method take an unsorted int array (arrayToSearch) and returns an 
     * int corresponding to the index of a key, if it is in the array
     * if the key is not in the array, this method returns -1
     * */
     return -1;
    }
    
    //DONE
    public static int searchSorted(int[] sortedArrayToSearch, int key){
    /**
     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
     * always be sorted in DESCENDING order. Again return the index of the key or return -1
     * if the key is not in the array
     * 
     * Note: You should attempt to write a method that is more efficient that searchUnsorted
     * */
    	for(int i = 0; i < sortedArrayToSearch.length; i++){
    		while(sortedArrayToSearch[i] > key){
    			i++;
    		}
    		if(sortedArrayToSearch[i] == key){
    			return i;
    		}
    	}
     return -1;
    }
    
    //DONE
    public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
    	for (int i = 0; i < array.length - 1; i++) {
    		if (array[i] > array[i+1]) {
    			return false;
    	    }
        }
    	return true;
    }
    
    //DONE
    public static double[] getStats(double[] array){
        
    	double mean = 0;
    	double max = 0;
    	double min = 0;
    	double median = 0;
    	double greater = 0;
    	double lesser = 0;
    	
    	//get mean
    	for(int i = 0; i < array.length; i++){
    		mean = mean + array[i];
    	}
    	mean = mean/array.length;
    	
    	//values greater than mean
    	for(int i = 0; i < array.length; i++){
    		if(array[i] >= mean){
    			greater++;
    		}
    	}
    	
    	//values less than mean
    	for(int i = 0; i < array.length; i++){
    		if(array[i] < mean){
    			lesser++;
    		}
    	}
    	//get max
    	for(int i = 0; i < array.length; i++){
    		max = array[i];
    		for(int j = 0; j < array.length; j++){
    			if(array[j] >= max){
    				max = array[j];
    			}
    		}
    	}
    	
    	//get min
    	for(int i = 0; i < array.length; i++){
    		min = array[i];
    		for(int j = 0; j < array.length; j++){
    			if(array[j] <= min){
    				min = array[j];
    			}
    		}
    	}
    	
    	//get median
    	boolean sorted = true;
    	for (int i = 0; i < array.length - 1; i++) {
    		if (array[i] > array[i+1]) {
    			sorted = false;
    	    }
        }
    	
    	if(sorted){
    		if((array.length) % 2 == 1){
    			median = array[(int) ((array.length/2)+0.5)];
    			System.out.println(median);
    		}
    		if((array.length) % 2 == 0){
    			double temp = (array.length) / 2;
    			double lower = (temp - 1);
    			temp = array[(int) temp];
    			lower = array[(int) lower];
    			median = (lower + temp) / 2;
    			System.out.println(median);
    		}
    	}
    	
    	if(!sorted){
    		sortArray(array);
    		if((array.length) % 2 == 1){
    			median = (array[(int) ((array.length/2)+0.5)]);
    			System.out.println(array[(int) ((array.length/2)+0.5)]);
    		}
    		if((array.length) % 2 == 0){
    			double temp = (array.length) / 2;
    			double lower = (temp - 1);
    			temp = array[(int) temp];
    			lower = array[(int) lower];
    			median = (lower + temp) / 2;
    			System.out.println((lower + temp) / 2);
    		}
    	}
    	
    	/** 
         * This method return a double[] contain a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean
         * index 1 = the max
         * index 2 = the min
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
         * */
         double[] stats = {mean, max, min, median, greater, lesser};
         System.out.println(Arrays.toString(array));
         System.out.println(Arrays.toString(stats));
         return stats;
    }	
    
    //DONE
    public static void reverseOrder(int[] array){
        
    	int temp;

    	for (int i = 0; i < (array.length)/2; i++)
    	  {
    	     temp = array[i];
    	     array[i] = array[(array.length - 1) - i];
    	     array[(array.length - 1) - i] = temp;
    	  }
    	System.out.println(Arrays.toString(array));
    	}
    	
    	/**
         * this method reverses the order of the array passed to it.
         * Not that this method does not have a return type. You do not need to copy the array first
         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
         * in a random order, though you still need to reverse whatever order it is in
         * 
         * Example:
         * array = {5, 1, 9, 10, 16, -6}
         * after calling this method
         * array = {-6, 16, 10, 9, 1, 5}
         * 
         * */
    
    //DONE
    public static int countDifferences(int[] array1, int[] array2){
    	int counter = 0;
    	for(int i = 0; i < array1.length; i++){
    		if(array1[i] != array2[i]){
    			counter++;
    		}
    	}
    	/**Here, you will write an method that returns the number of values in two arrays 
         * that are NOT the same (either in value OR location).
         * The arrays ALWAYS have the same length
         * Examples:
         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
         * 
         * */
    	System.out.println(Arrays.toString(array1));
    	System.out.println(Arrays.toString(array2));
    	System.out.println("Number of Differences: " + counter);
        return counter;
    }
    

    public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consecutive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
        
        return 0;
    }

    public static int longestSharedSequence(int[] array1, int[] array2){
        int max = 0;
        int count = 0;
        //test
    	for(int seqStart = 0; seqStart < array1.length; seqStart++){
    		int seqEnd = seqStart;
    		int[] seq = getSequence(seqStart, seqEnd, array1);
    		if(checkSequence(seq, array2)){
    			count ++;
    			if(count > max){
    				max = count;
    			}
    		}
    		count = 0;
    	}
    	/**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
        
        return max;
    }

    private static boolean checkSequence(int[] seq, int[] arr) {
		//i checks every value in arr
    	for(int i = 0; i < arr.length; i++){
    		for(int j = 0; j < seq.length; j++){
    			if(seq[j] != arr[j + i]){
    				break;
    			}
    			else if(j == seq.length - 1){
    				return true;
    			}
    		}
    	}
		return false;
	}

	private static int[] getSequence(int seqStart, int seqEnd, int[] array1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int[] generateDistinctItemsList(int n){
        int[] array = new int[n];
		for(int i = 0; i < n; i++){
			
        }
		/**
         * This method needs to generate an int[] of length n that contains distinct, random integers
         * between 1 and 2n 
         * The method will be tested by verifying that the array you return is n items long,
         * contains only entries between 1 and 2n (inclusive) and has no duplicates
         * 
         * */
        return null; 
    }
    
    
    public static void cycleThrough(int[] array, int n){
    	while(n > 0)
    	{
    		n--;
    		cycleOnce(array);
    	}
        /** This problem represents people moving through a line.
         * Once they get to the front of the line, they get what they've been waiting for, then they 
         * immediately go to the end of the line and "cycle through" again.
         * 
         * This method reorders the array so that it represents what the array would look like
         * after it had been cycled through an n number of times.
         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
         * 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
         * 
         * Likewise,
         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
         * and the most interesting case, 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
         * was able to go through one more time than anyone else
         * 
         * CHALLENGE
         * For extra credit, make your method handle NEGATIVE n
         * */
    }

	private static void cycleOnce(int[] array) {
		for(int i = array.length; i < 0; i--){
			swap(array, 0, i);
		}
	}
	
	public static void swap(int[] arr, int a, int b){
		int placeholder = arr[a];
		arr[a] = arr[b];
		arr[b] = placeholder;
	}
	
	public static void sortArray(double[] array) {
	    boolean swapped = true;
	    int j = 0;
	    double temp;
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < array.length - j; i++) {
	            if (array[i] > array[i + 1]) {
	                temp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = temp;
	                swapped = true;
	            }
	        }
	    }
	}
	/*sorting array
	 * while(!isSorted(arr)){
	 * if(arr[0] > arr[1])
	 * swap(arr, 0, 1);
	 * }
	 */
}

