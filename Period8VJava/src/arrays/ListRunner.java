package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ListRunner {

	static ArrayList<Item> shoppingList;
	
	public static void main(String[] args){
		String[] justDescriptions = getDescriptions();
		initLists(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void printPurchasedItems() {
		for(int i = 0; i < shoppingList.size(); i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println(shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				i--;
			}
		}
	}

	private static void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
	}

	private static void initLists(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();
		for(String s: justDescriptions){
			shoppingList.add(new Item(s));
		}
	}

	private static String[] getDescriptions() {
		String[] test = {"coffee", "video games", "potato chips", "a life"};
		return test;
	}
}
