package toadboo;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Character {
	
	PApplet app;
	int moveX;
	int moveY;
	//Images characters and powers
	PImage booaka;
	PImage booao;
	PImage boomidori;
	PImage booorenji;
	PImage toad;

	public Character (int posX,int posY,PApplet app) {
		moveX=posX;
		moveY=posY;
		this.app=app;
		toad=app.loadImage("images/1x/toad.png");
		booaka=app.loadImage("images/1x/booaka.png");
		booao=app.loadImage("images/1x/booao.png");
		boomidori=app.loadImage("images/1x/boomidori.png");
		booorenji=app.loadImage("images/1x/booorenji.png");

	}
	public void eat() {
		
	}
	public abstract void loadImage();

	public void powerCherry() {
		
	}
	public void powerGrapestar() {
		
	}
	public abstract void move();
	
	public PApplet getApp() {
		return app;
	}
	public void setApp(PApplet app) {
		this.app = app;
	}
	public int getMoveX() {
		return moveX;
	}
	public void setMoveX(int moveX) {
		this.moveX = moveX;
	}
	public int getMoveY() {
		return moveY;
	}
	public void setMoveY(int moveY) {
		this.moveY = moveY;
	}
	public PImage getBooaka() {
		return booaka;
	}
	public void setBooaka(PImage booaka) {
		this.booaka = booaka;
	}
	public PImage getBooao() {
		return booao;
	}
	public void setBooao(PImage booao) {
		this.booao = booao;
	}
	public PImage getBoomidori() {
		return boomidori;
	}
	public void setBoomidori(PImage boomidori) {
		this.boomidori = boomidori;
	}
	public PImage getBooorenji() {
		return booorenji;
	}
	public void setBooorenji(PImage booorenji) {
		this.booorenji = booorenji;
	}
	public PImage getToad() {
		return toad;
	}
	public void setToad(PImage toad) {
		this.toad = toad;
	}

	
}
