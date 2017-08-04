package tr.org.linux.kamp.GameExamp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;
/**
 * Game window panel.
 * Adds ArrayList GameObjects for draw into screen.
 * @author atakan
 *
 */
public class GamePanel extends JPanel {

	private ArrayList<GameObject> gameObjects;

	public GamePanel(ArrayList<GameObject> gameObjects) {
		this.gameObjects = gameObjects;
	}

	
	/**
	 * Draw method
	 * Adds gameObjects in ArrayList into screen
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		for (GameObject gameObject : gameObjects) {
			gameObject.Draw(g2d);
		}
	}

}
