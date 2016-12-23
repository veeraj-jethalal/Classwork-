package whackAMole;

import java.util.ArrayList;

import guiPractice.components.Action;
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
		timeLeft = 30.0;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
//		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30,120,60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60,50,120,60, "");
//		viewObjects.add(player);
		viewObjects.add(label);
		viewObjects.add(timeLabel);
	}
	
	private PlayerInterface getAPlayer(){
		return null;
	}

	private MoleInterface getAMole() {
		return null;
	}
	
	private void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void update(){
		super.update();
	}
	
	@Override
	public void run() {
		changeText("Set...");
		changeText("GO!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0){
			//frame updates ever 100ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText("" + (int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}
	}

	private void addNewMoles() {
		//probability of mole appearing depends on time left
		double probability = .2+.1*(30.0-timeLeft)/30;
		if(Math.random() < probability){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//remove Mole from viewObjects
					remove(mole);
					//remove mole from "database"
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		/**each mole has a clock
		 * when the clock counts down to 0, it disappears
		 */
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime()-100);
			if(m.getAppearanceTime() <= 0){
				//remove from viewObjects
				remove(m);
				//remove it from mole database
				moles.remove(i);
				i--; //compensate for i++
			}
		}
	}
}
