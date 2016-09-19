package introduction;

public class OOP {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian", "18");
		jillian.talk();
		((Senior)jillian).age();
		
		Student joseph = new Junior("Joseph");
		joseph.talk();
		
		Student jordan = new Sophomore("Jordan");
		jordan.talk();
	} 
} 