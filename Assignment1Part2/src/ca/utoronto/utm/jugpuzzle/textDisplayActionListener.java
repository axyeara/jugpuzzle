package ca.utoronto.utm.jugpuzzle;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * @author csc207 student
 * ActionListener class for the text that displays after clicking a Jug in JugPuzzle GUI.
 *
 */
public class textDisplayActionListener implements ActionListener {
	private int numClicks = 0;
	JLabel textDisplay;
	JButton firstBtn;
	JButton secondBtn;
	JugPuzzle puzzleModel;

	/**
	 * Constructor for textDisplayActionListener class given the JLabel to edit and JugPuzzle object.
	 * 
	 * @param textDisplay a JLabel to edit after clicking Jug JButton.
	 * @param puzzleModel JugPuzzle object which defines the state of current puzzle and GUI.
	 */
	textDisplayActionListener(JLabel textDisplay, JugPuzzle puzzleModel){
		this.textDisplay = textDisplay;
		this.puzzleModel = puzzleModel;
	}
	/* 
	 * Defines that actions that take place upon clicking a Jug JButton. The JButton will be disabled
	 * after clicking and the text displays the Jug you have chosen and further instructions. If the
	 * JugPuzzle is solved, all the JButtons are disabled.
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		if (numClicks == 0) {
			textDisplay.setText("You have selected " + e.getActionCommand());
			firstBtn = (JButton) e.getSource();
			firstBtn.setEnabled(false);
			numClicks++;
		}
		else {
			secondBtn = ((JButton) e.getSource());
			textDisplay.setText("You have spilled " + firstBtn.getActionCommand() + " to " + secondBtn.getActionCommand());
			numClicks = 0;
			if (!(puzzleModel.getIsPuzzleSolved())){
				firstBtn.setEnabled(true);
			}
			else {
				firstBtn.setEnabled(false);
			}
		}
	}
}