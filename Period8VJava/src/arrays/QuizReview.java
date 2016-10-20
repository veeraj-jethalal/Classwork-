package arrays;

import java.util.Scanner;

public class QuizReview {
	
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	private static String username = "test_user";
	private static String password = "test";
	
	public static void main(String[] args){
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unknown username, "
					+ "please contact the network"
					+ " administrator");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		while(inLoop){
			System.out.println("Enter your password");
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You have logged in");
				inLoop = false;
			}
			else{
				triesRemaining--;
				if(triesRemaining == 0){
					System.out.println("You have 0 tries remaining");
					inLoop = false;
				}
				else{
					System.out.println("You have " + triesRemaining +
						" attempt(s) left");
				}
			}
		}
	}

	private static boolean correctUser(){
		System.out.println("Enter your username");
		return waitForEntry().equals(username);
	}
}