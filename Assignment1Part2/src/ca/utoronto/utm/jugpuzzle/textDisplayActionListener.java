package ca.utoronto.utm.jugpuzzle;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class textDisplayActionListener implements ActionListener {
	private int numClicks = 0;
	JLabel textDisplay;
	JButton firstBtn;
	JButton secondBtn;
	JugPuzzle puzzleModel;

	textDisplayActionListener(JLabel textDisplay, JugPuzzle puzzleModel){
		this.textDisplay = textDisplay;
		this.puzzleModel = puzzleModel;
	}
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