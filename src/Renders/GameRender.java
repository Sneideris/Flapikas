package Renders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Pagrindas.Flappy;

public class GameRender {
	public static double score = 0;
	public static void render() {
		
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, Flappy.WIDTH, Flappy.HEIGHT);
		TubesRender.render(g);
		BirdRender.render(g);
		g.setColor(Color.white);
		g.drawString("Score: "+ (int)score, 10, 20);
		g.dispose();
		bs.show();
		}
}
