package toadboo;

import processing.core.PApplet;

public class BooMidori extends Character {

	PApplet app;
	
	public BooMidori (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		
	}
	public void loadImage() {
		this.app.image(boomidori, 0, 0);

	}
	
	public void move() {
		
	}

}
