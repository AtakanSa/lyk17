package tr.org.linux.kamp.WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import tr.org.linux.kamp.GameExamp.GameLogic;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class FirstPanel extends JPanel {
	private JTextField textField;
	private JPasswordField pwdL;
	private ButtonGroup buttonGroup;

	public enum Difficulty {
		EASY, NORMAL, HARD
	}

	/**
	 * Create the panel.
	 */
	public FirstPanel() {
		setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][][][][][][]"));

		JLabel lblUserName = new JLabel("User Name:");
		add(lblUserName, "cell 0 0");

		textField = new JTextField();
		add(textField, "cell 3 0,growx");
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		add(lblPassword, "cell 0 1");

		pwdL = new JPasswordField();
		add(pwdL, "cell 3 1,growx");

		JLabel lblSelectColor = new JLabel("Select Color");
		add(lblSelectColor, "cell 0 2");

		JComboBox comboBox = new JComboBox();
		comboBox.addItem("RED");
		comboBox.addItem("GREEN");
		comboBox.addItem("BLUE");
		comboBox.addItem("YELLOW");

		add(comboBox, "cell 3 2,growx");

		JLabel lblDifficulty = new JLabel("Difficulty");
		add(lblDifficulty, "cell 0 3");

		JRadioButton rdbtnEasy = new JRadioButton("Easy");
		add(rdbtnEasy, "cell 3 3");

		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		add(rdbtnNormal, "cell 3 4");

		JRadioButton rdbtnHard = new JRadioButton("Hard");
		add(rdbtnHard, "cell 3 5");
		buttonGroup = new ButtonGroup();

		buttonGroup.add(rdbtnEasy);
		buttonGroup.add(rdbtnNormal);
		buttonGroup.add(rdbtnHard);

		rdbtnEasy.setSelected(true);

		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color selectedColor = Color.BLACK;
				switch (comboBox.getSelectedItem().toString()) {
				case "RED":
					selectedColor = Color.RED;
					break;
				case "BLUE":
					selectedColor = Color.BLUE;
					break;
				case "GREEN":
					selectedColor = Color.GREEN;
					break;
				case "YELLOW":
					selectedColor = Color.YELLOW;
					break;
				}

				Difficulty difficulty = Difficulty.EASY;

				if (rdbtnEasy.isSelected()) {
					difficulty = Difficulty.EASY;
				}

				else if (rdbtnNormal.isSelected()) {
					difficulty = Difficulty.NORMAL;
				}

				else if (rdbtnHard.isSelected()) {
					difficulty = Difficulty.HARD;
				}

				GameLogic gameLogic = new GameLogic(textField.getText(), selectedColor, difficulty);
				gameLogic.startApp();

			}
		});

		add(btnStart, "cell 3 6");

		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(FirstPanel.this, "Linux Yaz Kampı 2017 Tarafından Yapılmıştır", "ABOUT",
						JOptionPane.DEFAULT_OPTION);
			}
		});
		add(btnAbout, "cell 3 7");

	}

}
