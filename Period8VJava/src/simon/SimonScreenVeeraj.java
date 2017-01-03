package simon;

import java.util.ArrayList;

import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenVeeraj extends ClickableScreen implements Runnable {

	private TextLabel label;
	private ButtonInterfaceVeeraj[] btnint;
	private ProgressInterfaceVeeraj pgsint;
	private ArrayList<MoveInterfaceVeeraj> list;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenVeeraj(int width, int height) {
		super(width, height);
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		pgsint = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		list = new ArrayList<MoveInterfaceVeeraj>();
		//add 2 moves to start
		lastSelectedButton = -1;
		list.add(randomMove());
		list.add(randomMove());
		roundNumber = 0;
		viewObjects.add(pgsint);
		viewObjects.add(label);
	}

	private MoveInterfaceVeeraj randomMove() {
		Button b; 
		return getMove(b);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	**/
	private ProgressInterfaceVeeraj getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		// TODO Auto-generated method stub
		
	}

}
