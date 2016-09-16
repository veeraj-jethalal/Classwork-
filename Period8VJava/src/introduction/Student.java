package introduction;

public class Student {
	
	//these are the fields
	private String name;
	
	//this is a constructor (initialize fields)
	public Student(String name){
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hello, my name is" + name);
	}
}
