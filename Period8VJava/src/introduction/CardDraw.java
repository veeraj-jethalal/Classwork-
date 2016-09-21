package introduction;

public class CardDraw {

	public static void main(String[] args) {
		String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
						   "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		int card = (int) (Math.random() *  values.length) + 0;
		
		int card2 = (int) (Math.random() * suits.length) + 0;
		
		String name = ("You just picked the " + values[card] + " of " + suits[card2]);
		System.out.println(name);
	}
}
