package Renders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class BirdRender {
	Room room;

	public BirdRender(Room room) {
	this.room = room;
	}
	public Bird(int x, int y,ArrayList<Rectangle> tubes) {
		setBounds(x,y,32,32);
		this.tubes = tubes;
	}
	public static void render(Graphics g) {
		int width = 20;
		int height = room.height1;
		g.setColor(Color.green);
		g.fillOval(x, y, width, height);
	}
}
