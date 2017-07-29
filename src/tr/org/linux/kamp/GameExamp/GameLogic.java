package tr.org.linux.kamp.GameExamp;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class GameLogic {

	private Player player;
	private ArrayList<GameObject> gameObjects;

	private GameFrame gameFrame;
	private GamePanel gamePanel;
	private boolean isGameRunning;

	private Random random;

	public GameLogic() {
		player = new Player(10, 10, 20, Color.BLUE);
		gameObjects = new ArrayList<GameObject>();
		gameObjects.add(player);
		gameFrame = new GameFrame();
		gamePanel = new GamePanel(gameObjects);
		
		random = new Random();
		fillChips();
	}

	private void fillChips() {
		for (int i = 0; i < 10; i++) {
			gameObjects.add(new Chip(random.nextInt(500), random.nextInt(500), 10, Color.GREEN));
			
		}
	}

	private void startGame() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(isGameRunning) {
					gamePanel.repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}).start();
	}
	
	public void startApp() {
		gameFrame.setContentPane(gamePanel);
		gameFrame.setVisible(true);
		isGameRunning = true;
		startGame();
		
	}
}
