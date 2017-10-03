package ca.utoronto.utm.labweek05;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PrimeTester {
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Prime Tester"); // Frame with title
		// What happens when we close the JFrame...
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Layout components in frame left to right, top to bottom
		frame.getContentPane().setLayout(new FlowLayout());

		JButton b, // Two reference to JButton, no buttons exist yet!!

		// Create the buttons
		b1 = new JButton("Is Prime?");

		// add them to the contentPane
		
		
	
		

		// Do the same with a JTextField
		JTextField t1 = new JTextField(10);
		frame.getContentPane().add(t1);
		frame.getContentPane().add(b1);
		JTextField t2 = new JTextField(10);
		frame.getContentPane().add(t2);
		t2.setEditable(false);

		// Create button press event handlers
		PrimeTesterActionListener mb1 = new PrimeTesterActionListener(t1,t2);
		

		// Tell the buttons who they should call when they are pressed
		b1.addActionListener(mb1);
		

		// tell the frame to pack in all the components
		// this is done according to the layout manager
		frame.pack();

		// lets see the frame
		frame.setVisible(true);

	}
}
