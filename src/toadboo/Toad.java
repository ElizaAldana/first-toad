package toadboo;

import processing.core.PApplet;

public class Toad extends Character {

	PApplet app;
	
	public Toad (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		
	}
	public void loadImage() {
		this.app.image(toad, 0, 0);
	}
	
	public void move() {
		
	}
}
