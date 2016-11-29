package sort;

public class PokemonClass {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public static void main(String[] args){
		PokemonClass squirtle = new PokemonClass("Squirtle", 26);
		PokemonClass bulbasaur = new PokemonClass("Bulbasaur", 50);
		squirtle.iChooseYou("Squirtle");
		bulbasaur.iChooseYou("Bulbasaur");
	}
	
	public PokemonClass(String name, int level){
		this.name = name;
		this.level = level;
		this.poisoned = false;
		hp = 100;
	}
	
	public void attack(PokemonClass target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}
		else System.out.println("The attack missed");
	}
	
	public void iChooseYou(String name){
		System.out.println(name + ", " + name + "!");
	}
	
	public int getHP(){
		return hp;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		poisoned = b;
	}
	
	public void lapse(){
		if(poisoned)hp-=15;
	}
}
