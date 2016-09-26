package ChatBot;

public class VeerajSchool extends Object implements chatBot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			VeerajMain.print("(Type 'quit' to go back.)");
			//this is called a static call
			schoolResponse = VeerajMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				VeerajMain.promptForever();
			}
			VeerajMain.print("That's my favorite part about school!");
		}
	}
}