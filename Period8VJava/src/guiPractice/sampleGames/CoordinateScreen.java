package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.AnimatedComponent;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	private MovingComponent animated;
	
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
		animated = new AnimatedComponent(30, 60, 80, 80);
		animated.setVy(3);
		animated.play();
		
//		viewObjects.add(label);
//		viewObjects.add(paragraph);
//		viewObjects.add(button);
//		viewObjects.add(picture);
//		viewObjects.add(animated);
		
		addAnimation(viewObjects);
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		AnimatedComponent a = new AnimatedComponent(50,50,200,200);
		int numberInRow = 5;
		int rows = 2;
		int w = 180;
		int h = 180;
		try{
			ImageIcon icon = new ImageIcon("resources/sampleImages/preview.png");
			for(int i = 0; i < numberInRow * rows; i++){
				BufferedImage cropped = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0; 
				int topMargin = 50;
				int x1 = leftMargin + w*(i%numberInRow);
				int y1 = topMargin + h*(i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, w, h, x1, y1, x1+w, y1+h,null);
				a.addFrame(cropped, 100);
			}
			//create a for loop that will take a
			//sub image from the sprite grid
		}
		catch(Exception e){
			e.printStackTrace();
		}
		viewObjects.add(a);
		a.play();
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
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
