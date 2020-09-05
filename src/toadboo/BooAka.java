package toadboo;

import processing.core.PApplet;

public class BooAka extends Character {
	
	PApplet app;

	public BooAka (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		
	}
	public void loadImage() {
		this.app.image(booaka, 0, 0);

	}
	
	public void move() {
		
	}

}
