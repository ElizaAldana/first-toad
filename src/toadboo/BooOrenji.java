package toadboo;

import processing.core.PApplet;

public class BooOrenji extends Character {

	PApplet app;
	
	public BooOrenji (int posX,int posY,PApplet app) {
		super (posX,posY,app);
		
	}
	public void loadImage() {
		this.app.image(booorenji, 0, 0);

	}
	
	public void move() {
		
	}

}
