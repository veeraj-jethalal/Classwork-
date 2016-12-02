package sort;

public class RecursionIntro {
	//Can you create a for loop without creating a "for" loop?
	public static void main(String[] args) {
		int n = 40;
		System.out.println("The " + n + "th Fibonacci is " + 
				fibonacci(n));
//		System.out.println("Using a for loop:\n");
//		for(int i = 0; i < 5; i++){
//			System.out.println("Hello world x" + (i+1));
//		}
//		System.out.println("\nWithout using a for loop:");
//		forLoop(5, new Action() {
//			private int value = 1;
//			public void act(){
//				System.out.println("Hello world x" + value);
//				value++;
//			}
//		});
	}

	private static int fibonacci(int n) {
		if(n<=1) return 1;
		else{
			int previous = fibonacci(n-1);
//			print("Before we find fibonacci " + n + " we need to" + 
//					" find fibonacci " + (n-1) + ", which is " +
//					previous);
			int previous2 = fibonacci(n-2);
			return previous + previous2;
		}
	}

	private static void forLoop(int i, Action action) {
		if(i <= 0) return; //base case
		else{
			//standard action
			action.act();
			//recursive call
			forLoop(i-1, action);
		}
	}
	
	private static int factorial(int num){
		int factorial = 1;
		for(int i = num; i > 0; i--){
			factorial = factorial * i;
		}
		System.out.println(num + " factorial is " + factorial);
		return factorial;	
	}
	
	private static int count = 1;
	
	public static void print(String s){
		System.out.println("Move # " + count + ": " + s);
		count++;
	}
	
	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		if(numberOfDiscs <= 1){
			print("Move " + startPeg + " to " + endPeg);
		}
		else{
			System.out.println("In order to move " + numberOfDiscs + " over to peg "
				+ endPeg + " we must move " + (numberOfDiscs-1) + 
				" over to peg " + midPeg + " first.");
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
	
	
}