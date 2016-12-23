package whackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private double appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, .50, "resources/sampleImages/mole.png");
	}

	public int getAppearanceTime() {
		return (int) appearanceTime;
	}

	public void setAppearanceTime(double d) {
		this.appearanceTime = d;
	}

	@Override
	public void setAppearanceTime(int i) {
		// TODO Auto-generated method stub
		
	}

}
