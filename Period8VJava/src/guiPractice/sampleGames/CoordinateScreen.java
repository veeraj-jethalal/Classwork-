package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	
	public CoordinateScreen(int width, int height){
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		picture = new Graphic(50,50,.5,"resources/sampleImages/Princess.png");
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		paragraph = new TextArea(40, 85, 760, 500, "this area works");
		button = new Button(40, 200, 125, 75, "Button", 
				new Color(55, 168, 55), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		viewObjects.add(picture);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX() + ", " + m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}
