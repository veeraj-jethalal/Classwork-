package sort;

public class RecursionIntro {
	//Can you create a for loop without creating a "for" loop?
	public static void main(String[] args) {
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
		
		hanoiSolution(4, "A", "B", "C");
		
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
	
	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		if(numberOfDiscs <= 1) System.out.println("Move " + startPeg + " to " + endPeg);
		else{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}