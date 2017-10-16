package ca.utoronto.utm.jugpuzzle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;


/**
 * @author csc207 student
 * 
 * Observer class for the resetActionListener Observable class and the JugPuzzle class. In charge of updating
 * and displaying the current amounts of units of liquid in the Jug objects of the JugPuzzle to the user through the GUI.
 *
 */
public class jugAmountView implements Observer {
	
	private JLabel JLabel;
	private int jugID;
	/**
	 * Constructor for the jugAmountView observer class given JLabel to to display text
	 * and the integer ID of Jug object in JugPuzzle.
	 * 
	 * @param JLabel a JLabel that displays the current amount of units of liquid in Jug.
	 * @param jugID an integer ID of Jug object in JugPuzzle.
	 */
	jugAmountView(JLabel JLabel, int jugID){
		this.JLabel = JLabel;
		this.jugID = jugID;
	}
	/*
	 * Updates to this observer class the current amount of units of liquid
	 * in a Jug after a user has made a move and is displayed through the JLabel.
	 * If the JugPuzzle is reset, the defaults amounts of liquid are displayed once again.
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (!(arg == "New game")) {	
			JugPuzzle puzzleModel = (JugPuzzle)o;
			JLabel.setText("Amount: " + puzzleModel.jugs[jugID].getAmount());		
		}	
		else {
			resetActionListener resetActionListener = (resetActionListener)o;
			JLabel.setText("Amount: " + resetActionListener.puzzleModel.jugs[jugID].getAmount());	
		}	
	}
}


