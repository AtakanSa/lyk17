package tr.org.linux.kamp.GameExamp;

import java.awt.Color;

import javax.swing.JLabel;

import tr.org.linux.kamp.WindowBuilder.FirstPanel.Difficulty;

public class AgaioCloneApp {
	public static void main(String[] args) {
	
	
		GameLogic gameLogic = new GameLogic("",Color.black,Difficulty.EASY);
	
		gameLogic.startApp();
		
	}
}
