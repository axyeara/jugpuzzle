package ca.utoronto.utm.jugpuzzle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class jugMoveActionListener implements ActionListener {
	private int fromJug;
	private int toJug;
	JugPuzzle puzzleModel;
	private int numClicks = 0;
	
	jugMoveActionListener(JugPuzzle puzzleModel){
		this.puzzleModel = puzzleModel;
	}
	public void actionPerformed(ActionEvent e) {
		if (numClicks == 0) {
			fromJug = (int) ((JButton) e.getSource()).getClientProperty("value");
			numClicks++;
		}
		else {
			toJug = (int) ((JButton) e.getSource()).getClientProperty("value");
			puzzleModel.move(fromJug, toJug);
			numClicks = 0;	
		}	
	}
}
