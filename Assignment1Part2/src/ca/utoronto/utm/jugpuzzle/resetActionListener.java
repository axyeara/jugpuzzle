package ca.utoronto.utm.jugpuzzle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.*;


/**
 * @author csc207 student
 * 
 *ActionListener class for the "reset / play again" JButton in the JugPuzzle GUI. 
 * This class also acts as an observable for the winView,jugAmountView and movesView observer classes.
 */
public class resetActionListener extends Observable implements ActionListener {
	JugPuzzle puzzleModel;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JLabel numMoves;
	
	
	/**
	 * Constructor for the resetActionListener class given the JugPuzzle object, and the three
	 * JButtons representing each Jug object in the GUI.
	 * 
	 * @param puzzleModel JugPuzzle object which defines the state of current puzzle and GUI.
	 * @param btn1 a JButton that represents the first Jug in JugPuzzle.
	 * @param btn2 a JButton that represents the second Jug in JugPuzzle.
	 * @param btn3 a JButton that represents the third Jug in JugPuzzle.
	 */
	resetActionListener(JugPuzzle puzzleModel, JButton btn1, JButton btn2, JButton btn3){
		this.puzzleModel = puzzleModel;
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
	}
	/* 
	 * Defines the actions that take place after clicking the "reset / play again" JButton.
	 * The JugPuzzle is restarted (i.e. the amount of the Jugs return to default amount)
	 * and the number of moves is set to 0.
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		puzzleModel.jugs[0] = new Jug(8,8);
		puzzleModel.jugs[1] = new Jug(5);
		puzzleModel.jugs[2] = new Jug(3);
		
		puzzleModel.setMoves(0);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		setChanged();
		notifyObservers("New game");
	}
}
