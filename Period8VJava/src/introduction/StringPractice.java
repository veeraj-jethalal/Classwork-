package introduction;

public class StringPractice {

	public static void main(String[] args) {
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
		System.out.println(s);
	}
}