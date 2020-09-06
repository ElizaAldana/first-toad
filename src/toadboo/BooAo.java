package toadboo;

import processing.core.PApplet;

public class BooAo extends Character {
	
	PApplet app;

	public BooAo (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		this.app = app;
	}
	public void loadImage() {
		app.image(booao, moveX, moveY);

	}
	

}
