package Renders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class BirdRender {
	public Bird(int x, int y,ArrayList<Rectangle> tubes) {
		setBounds(x,y,32,32);
		this.tubes = tubes;
	}
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, width, height);
	}
}
