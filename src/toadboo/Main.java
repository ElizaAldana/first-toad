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
	int row;
	int col;
	
	//matrix
		int [][] mb = {
			{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,
			 9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,
			 9,0,0,0,0,0,9,0,0,0,0,0,0,9,0,0,0,0,0,9,
			 9,0,0,0,0,0,9,0,9,9,9,9,0,9,0,0,0,0,0,9,
			 9,0,0,0,9,0,9,0,0,0,0,0,0,9,0,9,0,0,0,9,
			 9,9,9,9,9,0,0,0,0,0,0,0,0,0,0,9,9,9,9,9,
			 9,0,0,0,0,0,0,9,0,0,0,0,9,0,0,0,0,0,0,9,
			 9,0,0,9,9,0,0,9,0,0,0,0,9,0,0,9,9,0,0,9,
			 9,0,0,0,0,0,0,0,9,9,9,9,0,0,0,0,0,0,0,9,
			 9,9,9,9,9,0,0,0,0,0,0,0,0,0,0,9,9,9,9,9,
			 9,0,0,0,9,0,0,0,0,0,0,0,0,0,0,9,0,0,0,9,
			 9,0,0,0,0,0,9,0,0,0,0,0,0,9,0,0,0,0,0,9,
			 9,0,0,0,0,0,9,0,0,0,0,0,0,9,0,0,0,0,0,9,
			 9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9}
			};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("toadboo.Main");
	}

	
	public void settings () {
		size (1000,700);	
	}
	
	public void  setup () {
		screen= 2;
		board= loadImage("images/1x/board.png");
		inpage= loadImage("images/1x/inpage.png");
		lastscore= loadImage("images/1x/lastscore.png");
		youlose= loadImage("images/1x/youlose.png");
		youwin= loadImage("images/1x/youwin.png");
		row=20;
		col=14;
	}
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
		break;
		case 2:
			imageMode(CORNER);
			image(board,0,0);
			imageMode(CENTER);
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
		}
		break;
		}
	}
	public void keyPressed() {
	
	}
	}
