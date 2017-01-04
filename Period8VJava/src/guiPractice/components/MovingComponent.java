package guiPractice.components;

import java.awt.Color;
import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {

	private double vx;
	private double vy;
	private double posx;
	private double posy;
	private boolean running;
	private long moveTime; //time when image last moved
	public static final int REFRESH_RATE = 20;
	
	public MovingComponent(int x, int y, int h, int w) {
		super(x, y, h, w);
		vx = 0;
		vy = 0;
		running = false;
	}
	
	public boolean isAnimated(){
		return true;
	}

	public void checkBehaviors(){
		if(getY() > 300){
			setY(300);
			vy*=-1;
		}
		if(getY() < 0){
			setY(0);
		}
	}
	
	@Override
	public void run() {
		posx = getX();
		posy = getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running){
			try {
				Thread.sleep(REFRESH_RATE);
				checkBehaviors();
				update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		long difference = currentTime - moveTime;
		//this calculates time since last move
		if(difference >= REFRESH_RATE){
			moveTime = currentTime;
			//calculate new position
			posx += vx*(double)difference/REFRESH_RATE;
			posy += vy*(double)difference/REFRESH_RATE;
			//set only the location on the screen
			//NOT THE ACTUAL POSITION
			super.setX((int)posx);
			super.setY((int)posy);
		}
		drawImage(g);
	}
	
	public void drawImage(Graphics2D g) {
		g.setColor(Color.black);
		g.fillOval(0, 0, getWidth(), getHeight());
	}

	public void setY(int y){
		super.setY(y);
		posy = y;
	}
	
	public void setX(int x){
		super.setX(x);
		posx = x;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public void play() {
		if(!running){
			Thread go = new Thread(this);
			go.start();
		}
	}

}
