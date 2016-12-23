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
	private ArrayList<Visible> viewObjects;
	private BufferedImage image;
	
	public Screen(int width, int height){
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}
	
	public abstract void initObjects(ArrayList<Visible> viewObjects);

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
		g.setColor(Color.black);
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
	
	public void remove(Visible v){
		/**ArrayList notes
		 * While this method is very simple
		 * DO NOT UNDERESTIMATE the trickiness of removing 
		 * items in an ArrayList. It causes indices to change
		 * EXAMPLE: Suppose you have an ArrayList of integers
		 * And you want to remove all values greater than 5
		 * This is BAD:
		 * 
		 * for(int i = 0; i < list.size(); i++)
		 * 	if(list.get(i) > 5) list.remove(i);
		 * 
		 * Suppose you have (4,5,6,7)
		 * The first integer to be removed is 6, at index 2
		 * Since it gets removed, 7 moves from index 3 to 2
		 * Your list is now (4,5,7)
		 * After you increment i, i becomes 3
		 * This is out of bounds
		 * So 7 never gets removed
		 * Instead, when an object is removed,
		 * Decrease i to compensate for change in size
		 * 
		 * CORRECT
		 * 	for(int i = 0; i < list.size(); i++)
		 * 		if(list.get(i)>5){
		 * 			list.remove(i);
		 * 			i--;
		 * 		}
		 */
		viewObjects.remove(v);
		/**
		 * This removes the object that has the same identity
		 * as v, not an object that is equal to v
		 */
	}
	
	public void moveToFront(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
	
	public void moveToB(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(0,v);
		}
		//moves all objects with index >= n
		//forward by 1, increases size by 1
		//adds object to index n
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

	public void addObject(Visible v) {
		viewObjects.add(v);
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	/** Abstraction
	 * Interface:
	 * 		Description of methods
	 * Abstract Class:
	 * 		Some methods
	 * 		Some description of methods
	 */
}
