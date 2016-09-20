package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int results[] = new int[6];
		// declare variable, logic test, increment
		for(int index = 0; index < 10000; index ++){
			int result = rollUnfairDie();
			System.out.println("Roll #" + (index + 1) + " : " + rollUnfairDie());
		}
		for (int i = 0; i < 6; i++){
			System.out.println((i + 1) + " appeared " + results[i] + " times.");
		}
	}
	
	public static int rollUnfairDie(){
		double[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6};
		int randoms = (int) (Math.random() *  numbers.length) + 0;
		double roll2 = numbers[randoms];
		return (int) roll2;
		}
	}

