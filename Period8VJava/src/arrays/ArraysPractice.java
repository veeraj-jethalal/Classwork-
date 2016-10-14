package arrays;

public class ArraysPractice {
	
	static boolean[] boos3;
	
	public static void main(String[] args){
		/*In Java, arrays have a fixed length
		 * Indices start at 0
		 * They are indexed(ordered)
		 * They are common data types (e.g. Student[] - all
		 * elements in the array have to be students)
		 * Object[]: an array of any type
		 * If you want to put different primitive types in an array,
		 * you must use their WRAPPER CLASS (double --> Double, long --> Long)
		 */
		boolean[] boos1 = new boolean[3];
		//this can only be done at the declaration
		//because it sets size and content
		boolean[] boos2 = {false, false, false};
		//this does not work: boos3 = {false, false, false};
		//bottom line is all that will work
		boos3 = new boolean[3];
		
		/*2 ways of iterating through an array
		STANDARD FOR LOOP (use it if:)
		 	The index is important to keep track of
		 	You need to customize the order*/
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
	
		/*FOR EACH (use it if:)
		 * 		When the index is not important
		 * 		You don't need to customize
		 * 		Automatically assigns a "handle"
		 */
		for(boolean b:boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		String[] someStrings1 = new String[3];
		someStrings1[0] = "a";
		someStrings1[1] = "b";
		someStrings1[2] = "c";
		String[] someStrings2 = {"a","b","c"};
		for(int i = 0; i < someStrings1.length; i++){
			someStrings1[i] = "a new String";
		}
		//a loop to print it:
		for(String s: someStrings1){
			System.out.println(s);
		}
	}
}