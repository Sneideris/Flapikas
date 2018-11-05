import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Bird extends Rectangle{
	
	private int speed = 4;
	public boolean isPressed = false;
	private ArrayList<Rectangle> tubes;
	
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
		for(int i = 0;i < tubes.size();i++) {
			if(this.intersects(tubes.get(i))) System.exit(1);
		}
	}
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, width, height);
	}
}