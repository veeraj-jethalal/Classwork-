package introduction;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	
	public static void main(String[] args) {
		//demonstrateStringMethods();
		
		createField();
		promptName();
		//promptInput();
		promptForever();
	}
	
	public static void promptName(){
		print("Enter your name");
		user = input.nextLine();
		print("Glad to meet you, " + user + "! Your name is " + user 
				+ ". For the rest of the time, I will always call"
				+ " you " + user);
	}
	
	public static void promptForever() {
		while(true){
			promptInput();
		}
		
	}

	public static void promptInput() {
		print("Please type something " + user);
		String userInput = input.nextLine();
		print("Congratulations! You typed: " + userInput);
	}

	public static void createField() {
		input = new Scanner(System. in);
		user = "";
	}

	public static void demonstrateStringMethods(){
		/*String text1 = new String("Hello world");
		String text2 = "Hello world"; //same thing as above
		
		if(text1.equals(text2)) print("These strings are equal:");
		//use Object.equals(Object2) for strings
		else print("These are not equal:");
		
		print("text1: " + text1);
		print("text2: " + text2);*/
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0)
			print("word1 comes before word2");
	}
	
	public static void print(String s){
		String printString = s;
		int cutoff = 45;
		if(printString.length() > cutoff){
			for(int i = 0; i * cutoff < s.length(); i++){
				printString += getCut(s, cutoff, i+1) + "\n";
			}
		}
		System.out.println(printString);
		System.out.println(printString.length());
	}
	
	private static String getCut(String s, int cutoff, int cut){
		int cutIndex = cut * cutoff;
		if (cutIndex > s.length()){
			cutIndex = s.length();
		}
		
		String currentCut = s.substring(0, cutIndex);
		
		int indexOfLastSpace = currentCut.length() - 1;
		//start at last index, go backwards
		for(int i = currentCut.length() - 1; i >= 0; i--){
			String letter = currentCut.substring(i, i+1);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}
		
		//shorten the cut to end on a space
		currentCut = currentCut.substring(0, indexOfLastSpace);
		return currentCut;
	}
}