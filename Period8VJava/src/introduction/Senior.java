package introduction;

public class Senior extends Student {

	public Senior(String name) {
		//super will create a senior with the name of the student
		//super(name) has to happen first because a student needs to be created
		//before anything else happens
		super(name);
	}
	
	public void talk(){
		super.talk();
		System.out.println("...and I am a senior!");
	}
}
