package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextLabel extends Component {

	//FIELDS
	private String text;
	private String font;
	private int size;
	
	public TextLabel(int x, int y, int w, int h, String text) {
		super(x, y, h, w);
		this.text = text;
		font = "Helvetica";
		size = 20;
		update();
	}

	public void setText(String s){
		this.text = s;
		update(); //makes sure that the picture matches the data
	}
	
	public void setFont(String font){
		this.font = font;
		update();
	}
	
	public void setSize(int size){
		this.size = size;
		update();
	}
	
	public String getText() {
		return text;
	}

	public String getFont() {
		return font;
	}

	public int getSize() {
		return size;
	}
	
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		if(text != null){
			g.setFont(new Font(font, Font.PLAIN, size));
//			System.out.println(getHeight());
			g.drawString(text, 4, getHeight()-5);
		}
	}
}