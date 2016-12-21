package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Clickable;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class GraphicsClickScreen extends Screen implements MouseListener{

	private ClickableGraphic picture;
	
	public GraphicsClickScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(picture.isHovered(e.getX(), e.getY())){
			picture.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		picture = new ClickableGraphic(20,20,.2, "resources/sampleImages/princess.png");
		picture.setAction(new Action(){
			public void act(){
				picture.setX(picture.getX() + 10);
			}
		});
		viewObjects.add(picture);
	}

	public MouseListener getMouseListener(){
		return this;
	}
}
