package ChatBot;

import java.util.Scanner;

public class VeerajMain {

	static boolean inMainLoop;
	static String response;
	static Scanner input;
	static String user;
	//list all the chatBots available under this class
	static chatBot school;
		
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
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, " + user + ". How are you?");
			response = promptInput();
			if (findKeyword(response, "good", 0) >= 0){
				print("That's wonderful. So glad you feel good!");
			}
			
			else if(response.indexOf("school") >+ 0){
				print("School is great! Tell me about school.");
				//exit this while loop
				inMainLoop = false;
				//go to the schools talk method
				school.talk();
			}
			
			else{
				print("I don't understand");
			}
		}
	}

	public static int findKeyword(String searchString, String keyword, 
			int startPsn) {
		searchString = searchString.trim();
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		
		//find first position of keyword
		int psn = searchString.indexOf(0);
		//keep searching until context keyword found
		while(psn >= 0){
			//assume preceded and followed by space
			String before = " ";
			String after = " " ;
			//check character in front, if it exists
			if(psn > 0){
				before = searchString.substring(psn - 1, psn);
			}
			//check if there is a character after the keyword
			if(psn + keyword.length() < searchString.length()){
				after = searchString.substring(psn + keyword.length(),
						psn + keyword.length() + 1);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return psn;
			}
			else{
				//psn + 1 is one space after our current 
				//psn, so this finds the NEXT word
				psn = searchString.indexOf(keyword, psn + 1);
			}
		}
		return -1;
	}

	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
	}

	public static void createField() {
		input = new Scanner(System. in);
		user = "";
		school = new VeerajSchool();
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
		String printString = "";
		 int cutoff = 25;
		 //this while loop last as long as there are words left in the original String
		 while(s.length() > 0){

		 String currentCut = "";
		 String nextWord = "";

		 //while the current cut is still less than the line length 
		 //AND there are still words left to add
		 while(currentCut.length()+nextWord.length() < cutoff && s.length() > 0){

		//add the next word
		 currentCut += nextWord;
			 
		//remove the word that was added from the original String
		s = s.substring(nextWord.length());
			 
		 //identify the following word, exclude the space
		 int endOfWord = s.indexOf(" ");

		 //if there are no more spaces, this is the last word, so add the whole thing
		 if(endOfWord == -1) {
		 endOfWord = s.length()-1;//subtract 1 because index of last letter is one les than length
		 }

		 //the next word should include the space
		 nextWord = s.substring(0,endOfWord+1);
		 }

		 printString +=currentCut+"\n";

		 }
		 System.out.print(printString);
		 }

	/*public static void print(String s){
		String printString = s;
		int cutoff = 35;
		//Check for words to add (s has a length > 0)
		while(s.length() > 0){
			String cut = "";
			String nextWord = "";
		Check to see if the next word will fit on the line and there must still be words
		to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				//Add the next word to the line
				cut += nextWord;
					
				s = s.substring(nextWord.length());
					
				//identify the following word without the space
				int endOfWord = s.indexOf(" ");
				//if there are no more spaces, this is the last word.
				//So add the whole thing
				if(endOfWord == 1){
					endOfWord = s.length() - 1; //1 for the index
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
				
			printString += cut + "\n";
		}
	
		System.out.println(printString);
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
	}*/
}
