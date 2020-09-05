package toadboo;

import processing.core.PApplet;

public class BooAo extends Character {
	
	PApplet app;

	public BooAo (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		
	}
	public void loadImage() {
		this.app.image(booao, 0, 0);

	}
	
	public void move() {
		
	}

}
