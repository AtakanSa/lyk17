package tr.org.linux.kamp.GameExamp;

import javax.swing.JFrame;

/**
 * 
 * @author atakan sets window properties for game window. Sets title,sets size
 */
public class GameFrame extends JFrame {
	public GameFrame() {
		setTitle("Agario Clone");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setLocationRelativeTo(null);

	}
}
