package ca.utoronto.utm.jugpuzzle;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;


public class winView extends JLabel implements Observer {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	winView(JButton btn1, JButton btn2, JButton btn3){
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
	}
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
