package toadboo;

import processing.core.PApplet;

public class BooOrenji extends Character {

	PApplet app;
	
	public BooOrenji (int posX,int posY, PApplet app) {
		super (posX,posY,app);
		this.app = app;
	}
	public void loadImage() {
		app.image(booorenji, moveX, moveY);

	}
	
	
	
}
