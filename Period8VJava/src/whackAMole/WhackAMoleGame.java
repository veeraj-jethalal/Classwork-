package whackAMole;

import guiPractice.GUIApplication;

public class WhackAMoleGame extends GUIApplication {

	public static void main(String[] args) {
		WhackAMoleGame game = new WhackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

	public WhackAMoleGame() {
	}

	@Override
	protected void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);		
	}
}