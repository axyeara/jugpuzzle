package ca.utoronto.utm.jugpuzzle;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;


public class movesView extends JLabel implements Observer {
	JLabel numMoves;
	movesView(JLabel numMoves){
		this.numMoves = numMoves;
	}
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
