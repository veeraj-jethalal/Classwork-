package arrays;

public class ArraysPractice2 {
	public static void main(String[] args){
		long currentTime = System.currentTimeMillis();
		
		int[] fiftyNumbers = new int[5000];
		//populate(fiftyNumbers);
		//print(fiftyNumbers);
		
		//randomize(fiftyNumbers);
		//print(fiftyNumbers);
		
		rollDice(fiftyNumbers, 2);
		//print(fiftyNumbers);
		//count each die roll and provide a percentage
		countResult(fiftyNumbers, 2);
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime - currentTime) + 
				" milliseconds.");
	}
	
	private static void populate(int[] array){
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (i + 1);
		}
	}
	
	private static void print(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	private static void randomize(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * 500);
		}
	}
	
	private static void rollDice(int[] array, int numberOfDice){
		for(int i = 0; i < array.length; i++){
			int dice = 0;
			for(int j = 0; j < numberOfDice; j++){
				dice = dice + (int) (1 + (Math.random() * 6));
			}
		}
	}
	
	private static void countResult(int[] array, int numberOfDice){
		int[] counter = new int[numberOfDice * 6];
		for(int n: array){
			counter[n -1] = counter[n - 1] + 1;
		}
		for(int i = numberOfDice; i < counter.length; i ++){
			System.out.println((i + 1) + " was rolled " + 100*counter[i]/array.length +
					"% of the time.");
		}
	}
	
	/*private static void countResult(int[] array){
		int[] counts = new int[12];
		for(int i = 0; i < array.length; i ++){
			counts[(array[i] - 1)] += 1;
		}
		for(int j = 0; j < counts.length; j++){
			double percent = ((counts[j]) / (array.length) * 100);
			System.out.println(percent);
			System.out.println((j + 1) + " appeared " + counts[j] + " times.");
		}
	}*/
}

