package ca.utoronto.utm.jugpuzzle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.*;


public class resetActionListener extends Observable implements ActionListener {
	JugPuzzle puzzleModel;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JLabel numMoves;
	
	
	resetActionListener(JugPuzzle puzzleModel, JButton btn1, JButton btn2, JButton btn3){
		this.puzzleModel = puzzleModel;
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
	}
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
