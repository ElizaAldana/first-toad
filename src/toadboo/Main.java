package toadboo;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	
	//Images
	int screen;
	PImage board;
	PImage inpage;
	PImage lastscore;
	PImage youlose;
	PImage youwin;
	PImage booedible;
	PImage cherry;
	PImage coin;
	PImage grape;
	
	//call class
	Score score;
	Character toad;
	Character booaka;
	Character booao;
	Character boomidori;
	Character booorenji;
	
	//initial position characters
	int posXtoad, posYtoad;
	int posXbooaka, posYbooaka;
	int posXbooao, posYbooao;
	int posXboomidori, posYboomidori;
	int posXbooorenji, posYbooorenji;
	
	//score of this game
	int scoreGame;
	
	//matrix
	int row;
	int col;
	
	//move
	int toadMx;
	int toadMy;
	
	//time
	int time;
	int second;
	
	//Matrix?
	int gameMatrixX;
	int gameMatrixY;
	
	//Boo movements
	int booMidoriMx;
	int booMidoriMy;
	int booOrenjiMx;
	int booOrenjiMy;
	int booAoMx;
	int booAoMy;
	int booAkaMx;
	int booAkaMy;
	
	//Powers
	int grapeMx;
	int grapeMy;
	int grapePosX;
	int grapePosY;
	
	int cherryMx;
	int cherryMy;
	int cherryPosX;
	int cherryPosY;
	
	//matrix board
	int[][] mb = {
			{9,9,9,9,9,9,9,9,9,9,9,9,9,9},
			{9,9,2,8,2,9,2,2,2,9,2,2,1,9},
			{9,9,2,2,2,9,2,2,2,9,2,2,2,9},
			{9,9,2,2,2,9,2,9,2,9,2,2,2,9},
			{9,9,2,2,9,9,2,9,2,9,9,2,2,9},
			{9,9,2,2,2,2,2,2,2,2,2,2,2,9},
			{9,9,9,9,9,2,2,2,2,2,2,2,2,9},
			{9,9,2,2,2,2,9,9,2,2,2,9,9,9},
			{9,9,2,9,2,2,2,3,9,2,2,2,2,9},
			{9,9,2,9,2,2,4,2,9,2,2,2,2,9},
			{9,9,2,9,2,2,2,5,9,2,2,2,2,9},
			{9,9,2,9,2,2,6,2,9,2,2,2,2,9},
			{9,9,2,2,2,2,9,9,2,2,2,9,9,9},
			{9,9,9,9,9,2,2,2,2,2,2,2,2,9},
			{9,9,2,2,2,2,2,2,2,2,2,2,2,9},
			{9,9,2,2,9,9,2,9,2,9,9,2,2,9},
			{9,9,2,2,2,9,2,9,2,9,2,2,2,9},
			{9,9,2,2,2,9,2,2,2,9,2,2,2,9},
			{9,9,2,2,2,9,2,2,7,9,2,2,2,9},
			{9,9,9,9,9,9,9,9,9,9,9,9,9,9},
			};
			
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("toadboo.Main");
	}

	
	public void settings () {
		size (1000,700);	
	}
	
	public void  setup () {
		screen= 0;
		board= loadImage("images/1x/board.png");
		inpage= loadImage("images/1x/inpage.png");
		lastscore= loadImage("images/1x/lastscore.png");
		youlose= loadImage("images/1x/youlose.png");
		youwin= loadImage("images/1x/youwin.png");
		coin = loadImage("images/1x/coin.png");
		grape = loadImage("images/1x/grape.png");
		cherry = loadImage("images/1x/cherry.png");

		
		//toad position
		toad = new Toad (posXtoad, posYtoad, this);
		//booaka position
		booaka = new BooAka (posXbooaka, posYbooaka, this);
		//booaka position
		booao = new BooAo (posXbooao, posYbooao, this);
		//boomidori position
		boomidori = new BooMidori (posXboomidori, posYboomidori, this);
		//booorenji position
		booorenji = new BooOrenji (posXbooorenji, posYbooorenji,this);
		
		//matrix row col
		row=20;
		col=14;
		
		//visualize score
		scoreGame=0;
		score = new Score(scoreGame,this);
		
		//visualize time
		time=0;
		second=0;
		
		
	
	public void draw () {
		
		//Screen changes
		switch(screen) {
		case 0:
			imageMode(CORNER);
			image(inpage,0,0,width,height);
		break;
		case 1:
			imageMode(CENTER);
			image(lastscore,width/2,height/2);
			score.validateScore();
		break;
		case 2:
			textSize (30);
			imageMode(CORNER);
			image(board,0,0);
			imageMode(CENTER);
			text(scoreGame,157,60);
			
			//time
			text(time,500,64);
			second = second + 1;
			if (second == 100) {
				second = 0;
			}
			if (screen == 2 && second == 99) {
				time=time + 1;
			}
			
			//Matrix game
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					//toad Image
					if (mb [i][j] == 1) {
						toad.loadImage();
						}
					//booaka Image
					if (mb [i][j] == 3) {
						booaka.loadImage();
						}
					//booaka Image
					if (mb [i][j] == 4) {
						booao.loadImage();
						}
					//boomidori Image
					if (mb [i][j] == 6) {
						boomidori.loadImage();
						}
					//booorenji Image
					if (mb [i][j] == 5) {
						booorenji.loadImage();
						}
					//grape image
					if (mb [i][j] == 7) {
						image(grape,grapeMx*50+20,grapeMy*50+20);
						}
					//cherry image
					if (mb [i][j] == 8) {
						image(cherry,cherryMx*50+25,cherryMy*50+25);
						}
					//coin Image
					if(mb[i][j]== 2) {
						image(coin,i*50+25,j*50+25);
					
					}
				}
			}
			break;
		}
		
		text(mouseX+","+mouseY,mouseX,mouseY); //To know the coordinates
		
	}
	public void mouseClicked() {
		switch(screen) {
		case 0:
			//Click area (specific condition) 
			if (mouseX>374 && mouseY>446 && mouseX<624 && mouseY<498) {
				screen = 2;	
				scoreGame = 0;
				
		}
			if (mouseX>392 && mouseY>521 && mouseX<604 && mouseY<570) {
				screen = 1;
		}
			if (mouseX>408 && mouseY>594 && mouseX<584 && mouseY<645) {
			    exit();
		}	
		break;
		case 1:
			if (mouseX>649 && mouseY>290 && mouseX<677 && mouseY<316) {
				screen = 0;
		}
		break;
		case 2:
			if (mouseX>904 && mouseY>30 && mouseX<944 && mouseY<69) {
				screen = 0;
				score = new Score(scoreGame,this);
				second = 0;
				time = 0;
		}
		break;
		}
	}
	public void keyPressed() {
		if(keyCode==UP) {
			//System.out.println(toad.getMatrixY());
			System.out.println(mb[gameMatrixX][gameMatrixY]);
			if(mb[gameMatrixX][gameMatrixY - 1] == 2 ||
					mb[gameMatrixX][gameMatrixY - 1] == 0 ||
					mb[gameMatrixX][gameMatrixY - 1] == 3 ||
					mb[gameMatrixX][gameMatrixY - 1] == 4 ||
					mb[gameMatrixX][gameMatrixY - 1] == 5 ||
					mb[gameMatrixX][gameMatrixY - 1] == 6 ||
					mb[gameMatrixX][gameMatrixY - 1] == 7 ||
					mb[gameMatrixX][gameMatrixY - 1] == 8) {
				
				toad.moveUp();
				gameMatrixY = gameMatrixY - 1;
				
				//Score erasing coins
				if(mb[gameMatrixX][gameMatrixY] == 2) {
					mb[gameMatrixX][gameMatrixY] = 0;
					scoreGame = scoreGame + 100;
				}
			}
		}
		if(keyCode == DOWN) {
			if(mb[gameMatrixX][gameMatrixY + 1] == 2 ||
					mb[gameMatrixX][gameMatrixY + 1] == 1 ||
					mb[gameMatrixX][gameMatrixY + 1] == 0 ||
					mb[gameMatrixX][gameMatrixY + 1] == 3 ||
					mb[gameMatrixX][gameMatrixY + 1] == 4 ||
					mb[gameMatrixX][gameMatrixY + 1] == 5 ||
					mb[gameMatrixX][gameMatrixY + 1] == 6 ||
					mb[gameMatrixX][gameMatrixY + 1] == 7 ||
					mb[gameMatrixX][gameMatrixY + 1] == 8) {
				toad.moveDown();
				gameMatrixY = gameMatrixY + 1;
				
				//Score erasing coins
				if(mb[gameMatrixX][gameMatrixY] == 2) {
					mb[gameMatrixX][gameMatrixY] = 0;
					scoreGame = scoreGame + 100;
				}
			}
		}
		if(keyCode == RIGHT) {
			if(mb[gameMatrixX + 1][gameMatrixY] == 2 ||
					mb[gameMatrixX + 1][gameMatrixY] == 0 ||
					mb[gameMatrixX + 1][gameMatrixY] == 3 ||
					mb[gameMatrixX + 1][gameMatrixY] == 4 ||
					mb[gameMatrixX + 1][gameMatrixY] == 5 ||
					mb[gameMatrixX + 1][gameMatrixY] == 6 ||
					mb[gameMatrixX + 1][gameMatrixY] == 7 ||
					mb[gameMatrixX + 1][gameMatrixY] == 8) {
				toad.moveRight();
				gameMatrixX = gameMatrixX + 1;
				
				//Score erasing coins
				if(mb[gameMatrixX][gameMatrixY] == 2) {
					mb[gameMatrixX][gameMatrixY] = 0;
					scoreGame = scoreGame + 100;
				}
			}
		}
		if(keyCode == LEFT) {
			if(mb[gameMatrixX - 1][gameMatrixY] == 2 || 
					mb[gameMatrixX - 1][gameMatrixY] == 1 ||
					mb[gameMatrixX - 1][gameMatrixY] == 0 ||
					mb[gameMatrixX - 1][gameMatrixY] == 3 ||
					mb[gameMatrixX - 1][gameMatrixY] == 4 ||
					mb[gameMatrixX - 1][gameMatrixY] == 5 ||
					mb[gameMatrixX - 1][gameMatrixY] == 6 ||
					mb[gameMatrixX - 1][gameMatrixY] == 7 ||
					mb[gameMatrixX - 1][gameMatrixY] == 8
					) {
				toad.moveLeft();
				gameMatrixX = gameMatrixX - 1;
				
				//Score erasing coins
				if(mb[gameMatrixX][gameMatrixY] == 2) {
					mb[gameMatrixX][gameMatrixY] = 0;
					scoreGame = scoreGame + 100;
				}
			}
			
		}
	}	
	
}
