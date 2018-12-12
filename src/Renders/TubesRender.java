package Renders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class TubesRender extends Room {
	public static void render(Graphics g) {
		g.setColor(Color.red);
		for(int i = 0; i < tubes.size(); i++) {
			Rectangle rect = tubes.get(i);
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}
	}
}
