package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class ClickableGame extends GUIApplication {

	private static ClickableGame game;
	private static GraphicsClickScreen screen;

	public ClickableGame(){
		super();
	}
	
	@Override
	protected void initScreen() {
		screen = new GraphicsClickScreen(getWidth(), getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		game = new ClickableGame();
		Thread app = new Thread(game);
		app.start();
	}

}
