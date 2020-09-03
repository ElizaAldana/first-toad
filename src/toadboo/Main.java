package toadboo;

import processing.core.PApplet;
import processing.core.PImage;

class Main extends PApplet {
	
	int screen;
	PImage board;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("toadboo.Main");
	}

	
	public void settings () {
		size (1000,700);
		
	}
	public void  setup () {
		screen= 1;
		board= loadImage("images/board.png");
	}
	public void draw () {
		background (0);
		
	}
	public void mouseClicked() {
		
}
	public void keyPressed() {
	
	}
	}
