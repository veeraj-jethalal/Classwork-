package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiPractice.components.Visible;

public abstract class Screen {
	
	private int width;
	private int height;
	protected ArrayList<Visible> viewObjects;
	protected BufferedImage image;
	
	public Screen(int width, int height){
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}
	
	public abstract void initObjects(ArrayList<Visible> viewObjects2);

	private void initImage(){
		image = new BufferedImage(width, height, 
				BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update(){ 
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		//draw all visible components
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
//		g.setFont(new Font("Helvetica" , Font.BOLD, 20));
//		g.drawString("Hello", 57, 85);
//		g.drawOval(40, 40, 80, 80);
//		g.drawRect(40, 120, 80, 100);
//		g.drawLine(50, 220, 40, 265);
//		g.drawLine(90, 220, 100, 265);
//		
//		g.setColor(Color.green);
//		for(int i = 0; i < 200; i+=2){
//			g.drawLine(i, 265, i, 280);
//		}
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public MouseMotionListener getMouseMotionListener() {
		return null;
	}

	public MouseListener getMouseListener() {
		return null;
	}
	
	/** Abstraction
	 * Interface:
	 * 		Description of methods
	 * Abstract Class:
	 * 		Some methods
	 * 		Some description of methods
	 */
}
