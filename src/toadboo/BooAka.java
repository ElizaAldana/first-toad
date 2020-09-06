package toadboo;

import processing.core.PApplet;

public class BooAka extends Character {
	
	PApplet app;

	public BooAka (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		this.app = app;
		
	}
	public void loadImage() {
		app.image(booaka, moveX, moveY);

	}
	
	public void move() {
		
	}

}
