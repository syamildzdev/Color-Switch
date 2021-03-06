package fyp.colorswitch.entity.actor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D.Double;

import fyp.colorswitch.Handler;

public class Score extends Actor {

	public int playerScore;
	
	public Score(Handler handler, float yPosition) {
		super(handler, yPosition);
		x = 20;
		this.playerScore = 0;;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString(String.valueOf(playerScore), x, yPosition);
	}

	@Override
	public boolean collidesWith(Double body, int color) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
		if(playerScore > handler.getGame().getHighScore())
			handler.getGame().setHighScore(this.playerScore);
	}
	
}
