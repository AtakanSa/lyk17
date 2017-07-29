package tr.org.linux.kamp.UI;

import java.awt.Button;

import javax.swing.JFrame;

public class FrameExample {
	public static void main(String[] args) {
		PanelExp jPanel = new PanelExp();
		
		
		
		JFrame frame = new JFrame();
		frame.setContentPane(jPanel);
		frame.setTitle("Java Rocks !");
		frame.setSize(800, 600);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
}


