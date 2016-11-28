package sort;

public class PokemonClass {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public PokemonClass(String name2, int level2){
		name = name2;
		level = level2;
		poisoned = false;
		hp = 100;
	}
	
	public void iChooseYou(String name){
		System.out.println(name);
		System.out.println(name);
	}
	
	public int getHP(){
		return 0;
	}
	
	public String getName(){
		return "";
	}
	
	public void setHP(int newHP){
		
	}
	
	public void setPoisoned(boolean b){
		
	}
	
	public void lapse(){
		if(poisoned){
			hp = hp - 15;
		}
	}
}
