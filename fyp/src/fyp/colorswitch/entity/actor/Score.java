package fyp.colorswitch.entity.actor;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D.Double;

import fyp.colorswitch.Handler;

public class Score extends Actor {

	public Score(Handler handler, float yPosition) {
		super(handler, yPosition);
		x = 100;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		//updateyPosition();
	}

	@Override
	public void render(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.drawString("score", x, yPosition);
	}

	@Override
	public boolean collidesWith(Double body, int color) {
		// TODO Auto-generated method stub
		return false;
	}

}
