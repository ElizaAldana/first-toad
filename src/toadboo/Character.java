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
	
	//matrix movement
	int matrixX,matrixY;
	

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
	
	public void moveDown() {
		this.moveY= this.moveY +50;
		this.matrixY = this.matrixY +1;
	}
	public void moveUp() {
		this.moveY= this.moveY-50;
		this.matrixY = this.matrixY -1;
	}
	public void moveRight() {                                                                      
		this.moveX= this.moveX +50;
		this.matrixX= this.matrixX +1;
	}
	public void moveLeft() {      
		this.moveX= this.moveX -50;
		this.matrixX= this.matrixX -1;

	}
	
	
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
	public int getMatrixX() {
		return matrixX;
	}
	public void setMatrixX(int matrixX) {
		this.matrixX = matrixX;
	}
	public int getMatrixY() {
		return matrixY;
	}
	public void setMatrixY(int matrixY) {
		this.matrixY = matrixY;
	}
	

	
}
