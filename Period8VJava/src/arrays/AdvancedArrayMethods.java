package arrays;
@SuppressWarnings("unused")
public class AdvancedArrayMethods {
	
	public static void main(String[] args){
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
		swap(array, 0, (array.length - 1));
	}
	
	public static void swap(String[] arr, int a, int b){
		String placeholder = arr[b];
		arr[b] = arr[b];
		arr[a] = placeholder;
	}
	
	/*static int[] array;
	
	public static void main(String[] args){
		array = new int[100];
		int[] someArray = new int[50];
		methodA(someArray);
	}

	
	private static void methodA(int[] someArray){
		int[] newArray = new int[someArray.length];
	}
	
	public static void copyArray(int[] original, int[] target){
		if(original.length == target.length){
			for(int i = 0; i < original.length; i++){	
				target[i] = original[i];
			}
		}
		else{
			System.out.println("ERROR: tried to copy arrays"
					+ " of two different lengths");
		}
	}*/
}