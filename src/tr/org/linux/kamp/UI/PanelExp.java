package tr.org.linux.kamp.UI;

import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelExp extends JPanel {
	Button b = new Button();

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(2);
		System.out.println(a.toString());
		a.remove(new Integer(2));
		System.out.println(a.toString());
	}
}
