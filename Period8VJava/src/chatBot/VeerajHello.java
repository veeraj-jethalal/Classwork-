package chatBot;

public class VeerajHello implements chatBot{
	
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = 
		{"We already said hello. Let's move the conversation along",
		"You said hello already. Did you forget?"};
	
	private String[] angryResponses = 
		{"Okay seriously, stop saying hello", 
		"What is with you and saying hello?"
		};
	
	private int helloCount;
	
	public VeerajHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount ++;
			printResponse(); //helper method
			helloResponse = VeerajMain.promptInput();
			//negate by using !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				VeerajMain.promptForever();
			}
		}
	}

	private void printResponse() {
		if(helloCount > 4){
			int responseSelection = (int)(Math.random() * angryResponses.length);
			VeerajMain.print(angryResponses[responseSelection]);
		}
		else{
			int responseSelection = (int)(Math.random()*calmResponses.length);
			VeerajMain.print(angryResponses[responseSelection]);
		}
	}

	public boolean isTriggered(String userInput) {
		if(VeerajMain.findKeyword(userInput, "hello", 0) >= 0) return true;
		if(VeerajMain.findKeyword(userInput, "hi", 0) >= 0) return true;
		if(VeerajMain.findKeyword(userInput, "hey", 0) >= 0) return true;
		else return false;
	}
}
