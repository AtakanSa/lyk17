package tr.org.linux.kamp.GameExamp;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

public class GameLogic {

	private Player player;
	private ArrayList<GameObject> gameObjects;

	private GameFrame gameFrame;
	private GamePanel gamePanel;
	private boolean isGameRunning;
	private int xTarget;
	private int yTarget;
	ArrayList<GameObject> chipsToRemove;
	ArrayList<GameObject> minesToRemove;

	private Random random;

	public GameLogic() {
		player = new Player(10, 10, 15, Color.BLUE, 4);
		gameObjects = new ArrayList<GameObject>();
		gameObjects.add(player);
		gameFrame = new GameFrame();
		gamePanel = new GamePanel(gameObjects);
		chipsToRemove = new ArrayList<>();
		minesToRemove = new ArrayList<>();
		random = new Random();
		fillChips(10);
		fillMines(8);
		addMouseEvent();

	}

	private synchronized void checkCollisions() {

		for (GameObject gameObject : gameObjects) {
			if (player.getRectangle().intersects(gameObject.getRectangle())) {
				if (gameObject instanceof Chip) {
					player.setRadius(player.getRadius() + gameObject.getRadius());
					chipsToRemove.add(gameObject);

				}
				if (gameObject instanceof Mine) {
					player.setRadius((int)player.getRadius()/2);
					minesToRemove.add(gameObject);

				}
			}
		}

		gameObjects.removeAll(chipsToRemove);
		gameObjects.removeAll(minesToRemove);

	}

	
	private synchronized void addNewObjects() {
		fillChips(chipsToRemove.size());
		fillMines(minesToRemove.size());
		minesToRemove.clear();
		chipsToRemove.clear();

	}

	private synchronized void movePlayer() {

		if (xTarget > player.getX()) {
			player.setX(player.getX() + player.getSpeed());
		} else if (xTarget < player.getX()) {
			player.setX(player.getX() - player.getSpeed());
		}
		if (yTarget > player.getY()) {
			player.setY(player.getY() + player.getSpeed());
		} else if (yTarget < player.getY()) {
			player.setY(player.getY() - player.getSpeed());
		}

	}

	private synchronized void fillChips(int n) {
		for (int i = 0; i < n; i++) {
			gameObjects.add(new Chip(random.nextInt(500), random.nextInt(500), 10, Color.GREEN));

		}

	}

	private void fillMines(int n) {
		for (int i = 0; i < n; i++) {
			Mine mine =new Mine(random.nextInt(750), random.nextInt(750), 20, Color.RED);
			
			while(player.getRectangle().intersects(mine.getRectangle())) {
				mine.setX(random.nextInt(750));
				mine.setY(random.nextInt(750));
			}
			gameObjects.add(mine);
		}
	}

	private void startGame() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (isGameRunning) {
					movePlayer();
					checkCollisions();
					addNewObjects();

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

	private void addMouseEvent() {
		gameFrame.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		
		gamePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				xTarget = e.getX();
				yTarget = e.getY();

			}

			@Override
			public void mouseDragged(MouseEvent e) {

			}
		});

	}
}
