package Renders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Pagrindas.Room;

public class TubesRender extends Room {
	public TubesRender(Graphics g) {
		g.setColor(Color.red);
		for(int i = 0; i < tubes.size(); i++) {
			Rectangle rect = tubes.get(i);
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}
	}
}
