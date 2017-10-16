package ca.utoronto.utm.jugpuzzle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class displayActionListener implements ActionListener {
	JLabel textDisplay;
	displayActionListener(JLabel textDisplay){
		this.textDisplay = textDisplay;
	}
	public void actionPerformed(ActionEvent e) {
		textDisplay.setText("You have selected " + e.getActionCommand());
	}
}
