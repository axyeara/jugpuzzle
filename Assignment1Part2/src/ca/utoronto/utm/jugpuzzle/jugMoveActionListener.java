package ca.utoronto.utm.jugpuzzle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

/**
 * @author csc207 student
 * ActionListener class for the text that displays the number of moves in the JugPuzzle GUI.
 *
 */
public class jugMoveActionListener implements ActionListener {
	private int fromJug;
	private int toJug;
	JugPuzzle puzzleModel;
	private int numClicks = 0;
	
	/**
	 * Constructor for the jugMoveActionListener class given a JugPuzzle object.
	 * 
	 * @param puzzleModel JugPuzzle object which defines the state of current puzzle and GUI.
	 */
	jugMoveActionListener(JugPuzzle puzzleModel){
		this.puzzleModel = puzzleModel;
	}
	/* 
	 * Defines the actions that take place after you click two Jug JButtons in the GUI successively.
	 * A move is initiated in the JugPuzzle based on which Jug JButtons you clicked.
	 * 
	 */
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
