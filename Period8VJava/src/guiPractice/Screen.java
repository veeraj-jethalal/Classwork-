package guiPractice;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Screen {
	
	private int width;
	private int height;
	protected BufferedImage image;
	
	public Screen(int width, int height){
		this.width = width;
		this.height = height;
		initImage();
	}

	private void initImage(){
		image = new BufferedImage(width, height, 
				BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics 2D g = image.
	}
	
	public BufferedImage getImage(){
		return image;
	}
}
