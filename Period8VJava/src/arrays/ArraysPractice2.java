package arrays;


public class ArraysPractice2 {
	public static void main(String[] args){
		listPrimes(1000);
		
		long currentTime = System.currentTimeMillis();
		
		//int[] fiftyNumbers = new int[5000];
		//populate(fiftyNumbers);
		//print(fiftyNumbers);
		
		//randomize(fiftyNumbers);
		//print(fiftyNumbers);
		
		//rollDice(fiftyNumbers, 4);
		//print(fiftyNumbers);
		//count each die roll and provide a percentage
		//countResult(fiftyNumbers, 4);
		
		long endTime = System.currentTimeMillis();
		//System.out.println("The process took " + (endTime - currentTime) + 
				//" milliseconds.");
	}
	
	private static void listPrimes(int limit) {
		int lastToCheck = (int)(Math.sqrt(limit));
		boolean[] numbers = new boolean[limit + 1];
		for(int i = 0; i < limit+1; i++){
			numbers[i] = true;
		}
		//0 and 1 are not prime, by definition
		numbers[0] = false;
		numbers[1] = false;
		//check all numbers that are not crossed out yet
		for(int prime = 2; prime <= lastToCheck; prime++){
			if(numbers[prime]){
				System.out.println("\n" + prime + " is prime"
						+ " Crossing off: ");
				for(int i = (int)(Math.pow(prime, 2));
						i < limit+1; i+=prime){
					System.out.print(i + ", ");
					numbers[i] = false;
				}
			}
		}
		//print the primes
		System.out.println("\n" + "The primes are:");
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index]){
				System.out.print(index + ", ");
			}
		}
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
				array[i] = dice;
			}
		}
	}
	
	private static void countResult(int[] array, int numberOfDice){
		System.out.println("CountResult Method");
		int[] counter = new int[numberOfDice*6];
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

