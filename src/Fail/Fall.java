package Fail;

import Pagrindas.Bird;
import Pagrindas.Flappy;
import Pagrindas.Room;
import Renders.GameRender;

public class Fall extends Room{
	public Fall(int time) {
		super(time);
		{
			if (y >= Flappy.HEIGHT) {
				Flappy.room = new Room(80);
				tubes = Bird.tubes;
				GameRender.score = 0;
				y = Flappy.HEIGHT/2;
				}
			}
	}
}
