package toadboo;

import processing.core.PApplet;

public class Score {

	private int score;
	private int posX;
	private int posY;
	PApplet app;
	
	public Score (int score) {
		this.score=score;
		this.posX = 10;
		this.posY = 20;
	}
	
	public void validateScore() {
		app.text(this.score, posX, posY);
	}
}
