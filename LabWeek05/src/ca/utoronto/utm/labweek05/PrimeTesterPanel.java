package ca.utoronto.utm.labweek05;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;  

class PrimeTesterPanel extends JPanel implements ActionListener {
	JTextField tf;
	JTextField tf2;
	public PrimeTesterPanel(){
		// Method of JComponent

		

		JButton b;
		tf = new JTextField(10);
		add(tf);
		b=new JButton("Is prime?");    add(b); b.addActionListener(this);
		tf2=new JTextField(10);
		add(tf2);
		tf2.setEditable(false);
	}

	public void actionPerformed(ActionEvent e){
		
		try {
			int n = Integer.parseInt(tf.getText());
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