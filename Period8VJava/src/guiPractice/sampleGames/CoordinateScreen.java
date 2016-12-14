package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea area;
	private Button button;
	
	public CoordinateScreen(int width, int height){
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		area = new TextArea(40, 85, 760, 500, "this area works");
		button = new Button(40, 50, 100, 30, "Button", 
				new Color(0, 76, 153), new Action()){
			
		};
		viewObjects.add(label);
		viewObjects.add(area);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at" + m.getX() + ", " + m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}
