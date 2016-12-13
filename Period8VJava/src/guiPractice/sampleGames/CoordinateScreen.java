package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea area;
	
	public CoordinateScreen(int width, int height){
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects2) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		area = new TextArea(40, 85, 760, 500, "Sample Paragraph Sample "
				+ "Paragraph Sample Paragraph Sample Paragraph "
				+ "Sample Paragraph Sample Paragraph Sample Paragraph "
				+ "Sample Paragraph Sample Paragraph Sample Paragraph "
				+ "Sample Paragraph Sample Paragraph Sample Paragraph "
				+ "Sample Paragraph Sample Paragraph Sample Paragraph "
				+ "Sample Paragraph Sample Paragraph Sample Paragraph "
				+ "Sample Paragraph Sample Paragraph");
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
