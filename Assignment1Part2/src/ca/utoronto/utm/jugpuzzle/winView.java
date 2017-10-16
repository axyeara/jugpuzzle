package ca.utoronto.utm.jugpuzzle;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;


/**
 * @author csc207 student
 * 
 * Observer class for the resetActionListener class and the JugPuzzle class. In charge up updating and displaying 
 * whether the JugPuzzle is solved in the JugPuzzle GUI.
 *
 */
public class winView extends JLabel implements Observer {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	/**
	 * Initiates a constructor for the winView observer class given the three Jug JButtons that are to be clicked.
	 * 
	 * @param btn1 a JButton that represents the first Jug in JugPuzzle.
	 * @param btn2 a JButton that represents the second Jug in JugPuzzle.
	 * @param btn3 a JButton that represents the third Jug in JugPuzzle.
	 */
	winView(JButton btn1, JButton btn2, JButton btn3){
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
	}
	/* 
	 * Updates this observer class based on the current state of the JugPuzzle. If the
	 * JugPuzzle is solved, the three JButtons representing the Jug objects in the GUI
	 * are disabled. A text is displayed indicating that the player has won.
	 * 
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (!(arg == "New game")) {
			JugPuzzle puzzleModel = (JugPuzzle)o;
			if (puzzleModel.getIsPuzzleSolved()) {
				this.setText("Congratulations! You won in " + puzzleModel.getMoves() + " moves!");
				this.btn1.setEnabled(false);
				this.btn2.setEnabled(false);
				this.btn3.setEnabled(false);
			}
		}
		else {
			this.setText("");
		}		
	}
}
