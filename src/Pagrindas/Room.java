package Pagrindas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

import Renders.GameRender;

public class Room {
	public static ArrayList<Rectangle> tubes;
	private int time;
	private int currentTime = 0;
	private int speed = 5;
	private Random random;
	private final int SPACE_TUBES = 96;
	private final int WIDTH_TUBES = 32;
	public Room(int time) {
		tubes = new ArrayList<>();
		this.time = time;
		random = new Random();
	}
int height1=0;

public int getHeight1() {
	return height1;
}

	public static ArrayList<Rectangle> getTubes() {
	return tubes;
}

public static void setTubes(ArrayList<Rectangle> tubes) {
	Room.tubes = tubes;
}

	public void update() {
		currentTime++;
		if(currentTime == time) {
			currentTime = 0;
			int width = 20;
			height1 = random.nextInt(Flappy.HEIGHT/2);
			int y2 = height1 + SPACE_TUBES;
			int height2 = Flappy.HEIGHT - y2;
			tubes.add(new Rectangle(Flappy.WIDTH,0,WIDTH_TUBES,height1));
			tubes.add(new Rectangle(Flappy.WIDTH,y2,WIDTH_TUBES,height2));
		}
		for(int i = 0 ; i < tubes.size();i++) {
			Rectangle rect = tubes.get(i);
			rect.x -= speed;
			if(rect.x+rect.width <= 0) {
				tubes.remove(i--);
				GameRender.score+=0.5;
				continue;
			}
		}
	}

}
