package whackAMole;

import java.util.ArrayList;

import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(0, 0, 300, 300, "Ready...");
		timeLabel = new TextLabel(0,0,300,250, "60.0");
		viewObjects.add((Visible) moles);
		viewObjects.add(player);
		viewObjects.add(label);
		viewObjects.add(timeLabel);
	}
	
	private PlayerInterface getAPlayer(){
		return null;
	}

	private MoleInterface getAMole() {
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
