package guiPractice.components;

public class ClickableGraphic extends Graphic {

	public ClickableGraphic(int x, int y, String imageLocation, Action action) {
		super(x, y, imageLocation);	
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation, Action action) {
		super(x, y, w, h, imageLocation);
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action action) {
		super(x, y, scale, imageLocation);
	}
}