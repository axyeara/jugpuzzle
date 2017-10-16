package ca.utoronto.utm.jugpuzzle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;


public class jugAmountView implements Observer {
	
	private JLabel JLabel;
	private int jugID;
	jugAmountView(JLabel JLabel, int jugID){
		this.JLabel = JLabel;
		this.jugID = jugID;
	}
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


