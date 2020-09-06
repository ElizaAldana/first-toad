package toadboo;

import processing.core.PApplet;

public class BooMidori extends Character {

	PApplet app;
	
	public BooMidori (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		this.app = app;
		
	}
	public void loadImage() {
		app.image(boomidori,moveX,moveY);

	}
}
