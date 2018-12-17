package Pagrindas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Bird extends Rectangle{
	
	private int speed = 4;
	public boolean isPressed = false;
	private ArrayList<Rectangle> tubes;
	

	public void update() {
		if(isPressed) {
			y -= speed;
		}else {
			y+=speed;
		}
		for(int i = 0;i < tubes.size();i++) {
			if(this.intersects(tubes.get(i))) {
				Flappy.room = new Room(80);
				Flappy.score = 0;
				tubes = Flappy.room.tubes;
				y = Flappy.HEIGHT/2;
			}
		}
		if (y >= Flappy.HEIGHT) {
			Flappy.room = new Room(80);
			tubes = Flappy.room.tubes;
			Flappy.score = 0;
			y = Flappy.HEIGHT/2;
		}
	}

}