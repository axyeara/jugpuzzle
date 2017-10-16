package ca.utoronto.utm.jugpuzzle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

/**
 * @author csc207 student
 * 
 * ActionListener class for the "Exit" JButton in JugPuzzle GUI.
 *
 */
public class exitActionListener implements ActionListener {
	
	
	/* 
	 * Defines the action that take place after clicking the "Exit" JButton in GUI.
	 * The game exits.
	 */
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
