package Renders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import Pagrindas.Room;

public class BirdRender {

	public static void render(Graphics g) {
		int width = 20;
		Room room = new Room(80);
		int height =room.getHeight1();
		g.setColor(Color.green);
		g.fillOval(x, y, width, height);
	}

	
}
