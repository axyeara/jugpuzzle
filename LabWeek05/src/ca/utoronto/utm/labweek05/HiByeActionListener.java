package ca.utoronto.utm.labweek05;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class HiByeActionListener implements ActionListener {
	
	HiByeActionListener() {
	
	}

	// 1) Modify this so that it prints out which button was pressed.
	// Hint: Lookup ActionEvent
	// 2) Modify this so that it sets the JTextField to which button was pressed
	// Hint: MyButtonListener will need access to a JTextField

	// ActionListener requires that we implement the method below
	public void actionPerformed(ActionEvent e) {
		System.out.println(" button pressed");
	}
}
