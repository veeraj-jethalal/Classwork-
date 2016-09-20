package introduction;

public class RandomDiceRoll2 {
	
	public static void main(String[] args) {
		int[] results = new int[6];
		// declare variable, logic test, increment
			for(int index = 0; index < 10000; index ++){
				int result = rollFairDie();
				System.out.println("Roll #" + (index + 1) + " : " +result);
				results[result-1] ++;
			}
		
		//print the results
			for (int i = 0; i < 6; i++){
				System.out.println((i + 1) + " appeared " + results[i] + " times.");
			}
		}
	
	//method that returns 1-6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random(); //this returns a double between 0 and 1 exclusive
		int roll = (int) (6 * rand); //numbers including 0 to 5 inclusive
		roll ++;
		return roll;
	}			
}

