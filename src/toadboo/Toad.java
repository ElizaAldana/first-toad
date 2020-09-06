package toadboo;

import processing.core.PApplet;

public class Toad extends Character {

	PApplet app;
	
	public Toad (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		this.app = app;
	}
	
	public void loadImage() {
		app.image(toad, moveX, moveY);
	}
	
	public void move() {
		
	}
}
