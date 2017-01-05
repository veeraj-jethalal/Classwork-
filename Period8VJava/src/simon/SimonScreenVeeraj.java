package simon;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.components.Action;
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
		ButtonInterfaceVeeraj b;
		int random = (int)(Math.random()*btnint.length);
		while(random == lastSelectedButton){
			random = (int)(Math.random()*btnint.length);
		}
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
		int numberOfButtons = 6;
		Color[] colors = {Color.red, Color.green, Color.blue, Color.yellow, Color.pink, Color.orange};
		int initialX = 100;
		int initialY = 200;
		for(int i = 0; i < numberOfButtons; i++){
			final ButtonInterfaceVeeraj b = getAButton();
			b.setColor(colors[i]);
			b.setX(initialX + 50);
			b.setY(initialY + 50);
			initialX+=50;
			initialY+=50;
			b.setAction(new Action(){
				public void act(){
					if(acceptingInput){
						Thread blink = new Thread(new Runnable(){
							public void run(){
								b.highlight();
								Thread turnedOn = new Thread(turnedOn);
								Thread.sleep(800);
								b.dim();
							}
						});
						blink.start();
					}
				}
			});
		}
	}

}
