package sort;

public class MainBattle {
//
	public static void main(String[] args){
		Pokemon squirtle = new Pokemon("Squirtle", 26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 50);
		squirtle.iChooseYou("Squirtle");
		bulbasaur.iChooseYou("Bulbasaur");
		System.out.println("Squirtle is preparing to " +
				"attack with water blast");
		squirtle.attack(bulbasaur, new Attack(){
			public void attack(Pokemon target){
				//cuts health in half
				int newHP = target.getHP()/2;
				target.setHP(newHP);
			}
		});
		bulbasaur.attack(squirtle, new Attack() {
			public void attack(Pokemon target) {
				target.setPoisoned(true);
			}
		});
		squirtle.lapse();
		bulbasaur.lapse();
		printScore(squirtle, bulbasaur);
	}
	
	public static void printScore(Pokemon p1, Pokemon p2){
		System.out.println(p1.getName() + ", HP = " + p1.getHP());
		System.out.println(p2.getName() + ", HP = " + p2.getHP());
	}
}
