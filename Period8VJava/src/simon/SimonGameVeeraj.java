package simon;

import guiPractice.GUIApplication;
import whackAMole.WhackAMoleGame;
import whackAMole.WhackAMoleScreen;

public class SimonGameVeeraj extends GUIApplication {

	public SimonGameVeeraj() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		SimonScreenVeeraj ss = new SimonScreenVeeraj(getWidth(), getHeight());
		setScreen(ss);	
	}

	public static void main(String[] args) {
		SimonGameVeeraj game = new SimonGameVeeraj();
		Thread app = new Thread(game);
		app.start();
	}

}
