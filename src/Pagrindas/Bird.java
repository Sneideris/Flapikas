package Pagrindas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import Renders.GameRender;

public class Bird extends Rectangle{
	
	private int speed = 4;
	public boolean isPressed = false;
	public static ArrayList<Rectangle> tubes;
	
	public Bird(int x, int y,ArrayList<Rectangle> tubes) {
		setBounds(x,y,32,32);
		this.tubes = tubes;
	}

	public void update() {
		if(isPressed) {
			y -= speed;
		}else {
			y+=speed;
		}
		/*for(int i = 0;i < tubes.size();i++) {
			if(this.intersects(tubes.get(i))) {
				Flappy.room = new Room(80);
				GameRender.score = 0;
				tubes = Flappy.room.tubes;
				y = Flappy.HEIGHT/2;
			}
		}*/
		/*if (y >= Flappy.HEIGHT) {
			Flappy.room = new Room(80);
			tubes = Flappy.room.tubes;
			GameRender.score = 0;
			y = Flappy.HEIGHT/2;
		}*/
	}

	public Bird(int speed, ArrayList<Rectangle> tubes) {
		super();
		this.speed = speed;
		this.tubes = tubes;
	}

	public ArrayList<Rectangle> getTubes() {
		return tubes;
	}

	public void setTubes(ArrayList<Rectangle> tubes) {
		this.tubes = tubes;
	}

}