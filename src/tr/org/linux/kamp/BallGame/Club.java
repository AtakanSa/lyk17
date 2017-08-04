package tr.org.linux.kamp.BallGame;

import java.awt.Color;

public abstract class Club {
	private String clubName;
	private Color color;
	private int clubValue;
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getClubValue() {
		return clubValue;
	}
	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}
}
