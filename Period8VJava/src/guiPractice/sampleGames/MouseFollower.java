package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	public static MouseFollower game;
	public static MyScreen myScreen;
	
	private CoordinateScreen coordScreen;
	
	public static void main(String[] args){
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	
	protected void initScreen(){
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		myScreen = new MyScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}
}
