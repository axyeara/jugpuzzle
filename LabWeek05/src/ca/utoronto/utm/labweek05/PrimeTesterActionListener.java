package ca.utoronto.utm.labweek05;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class PrimeTesterActionListener implements ActionListener {
	
	JTextField tf1;
	JTextField tf2;
	
	PrimeTesterActionListener(JTextField tf1, JTextField tf2){
		this.tf1 = tf1;
		this.tf2 = tf2;
	}
	

	// 1) Modify this so that it prints out which button was pressed.
	// Hint: Lookup ActionEvent
	// 2) Modify this so that it sets the JTextField to which button was pressed
	// Hint: MyButtonListener will need access to a JTextField

	// ActionListener requires that we implement the method below
	public void actionPerformed(ActionEvent e) {
		try {
			int n = Integer.parseInt(tf1.getText());
			if (isPrime(n)) {
				tf2.setText("yes");
			}
			else {
				tf2.setText("no");
			}
		}
		catch(NumberFormatException nfe) {
			tf2.setText("invalid number");
		}
	}
	
	private boolean isPrime(int n){
		if (n == 0 || n == 1 || n < 0) {
			return false;
		}
		for(int i=2;i<n;i++){
			if(n%i == 0) return false;
		}
		return true;
	}
}
