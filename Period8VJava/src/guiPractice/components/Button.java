package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{

	private Color color;
	private Action action;
	
	public Button(int x, int y, int h, int w, String text,
			Color color, Action action) {
		super(x, y, h, w, text);
		this.color = color;
		this.action = action;
	}
	
	public void update(Graphics2D g){
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		if(getText() != null){
			g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
			g.drawString(getText(), 4, getHeight()-5);
		}
		g.drawRoundRect(getX(), getY(), getWidth(), getHeight(), 30, 30);
		g.fillRoundRect(getX(), getY(), getWidth(), getHeight(), 30, 30);
	}
	
	public boolean isHovered(int x, int y){
		if(x >= getX() && x<= (getX() + getWidth()) 
				&& y>=getY() && y <= (getY() + getHeight())){
					return true;
				}
		else return false;
	}
	
	public void act(){
		Action.act();
	}
}
