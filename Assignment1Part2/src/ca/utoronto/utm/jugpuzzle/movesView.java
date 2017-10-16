package ca.utoronto.utm.jugpuzzle;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;


/**
 * @author csc207 student
 * 
 * Observer class for the resetActionListener and JugPuzzle classes. In charge of 
 * updating the the total number of moves the user has made in the JugPuzzle.
 *
 */
public class movesView extends JLabel implements Observer {
	JLabel numMoves;
	
	/**
	 * Constructor for the movesView observer class given the JLabel
	 * that displays the number of moves to the user in GUI.
	 * 
	 * @param numMoves an integer total amount of moves the user has made in the JugPuzzle.
	 */
	movesView(JLabel numMoves){
		this.numMoves = numMoves;
	}
	/* 
	 * Updates to this observer class the total number of moves the user has made in the JugPuzzle.
	 * If the JugPuzzle is reset, the total number of moves is set back to 0.
	 * 
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (!(arg == "New game")) {
			JugPuzzle puzzleModel = (JugPuzzle)o;
			this.numMoves.setText("Number of moves: " + puzzleModel.getMoves());
		}
		else {
			resetActionListener resetActionListener = (resetActionListener)o;
			this.numMoves.setText("Number of moves: " + resetActionListener.puzzleModel.getMoves());
		}
	}
}
