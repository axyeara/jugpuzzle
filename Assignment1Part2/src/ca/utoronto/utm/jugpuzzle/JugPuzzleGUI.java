package ca.utoronto.utm.jugpuzzle;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;


/**
 * @author csc207 student
 * Controller class for the JugPuzzle GUI
 */
public class JugPuzzleGUI {
	/**
	 * Method that runs JugPuzzle GUI. Method includes JComponents (e.g. JButtons, JLabels) and ActionListeners, which were implemented based on MVC design.
	 */
	public static void createAndShowGUI(){
		JFrame puzzleFrame = new JFrame("Jug Puzzle");
		puzzleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container puzzleContainer = puzzleFrame.getContentPane();
		puzzleContainer.setLayout(new GridLayout(0,3));
		JugPuzzle puzzleModel = new JugPuzzle();
		
		
		
		
		// JComponents
		JLabel textDisplay = new JLabel("Welcome to the Jug Puzzle! Select a jug to spill from.");
		
		ImageIcon jugIcon = new ImageIcon(JugPuzzleGUI.class.getClassLoader()
                .getResource("images/jug.jpg"));
		
		JButton jugButton1 = new JButton("Jug One",jugIcon);
		jugButton1.putClientProperty("value", 0);
		jugButton1.setBackground(Color.WHITE);
		JButton jugButton2 = new JButton("Jug Two", jugIcon);
		jugButton2.setBackground(Color.WHITE);
		jugButton2.putClientProperty("value", 1);
		JButton jugButton3 = new JButton("Jug Three", jugIcon);
		jugButton3.setBackground(Color.WHITE);
		jugButton3.putClientProperty("value", 2);
		JButton resetButton = new JButton("Reset / Play Again");
		JButton exitButton = new JButton("Quit Puzzle");
		JLabel jugAmount0 = new JLabel("Amount: 8");
		JLabel jugAmount1 = new JLabel("Amount: 0");
		JLabel jugAmount2 = new JLabel("Amount: 0");
		JLabel numMoves = new JLabel("Number of moves: 0");
		
		// ActionListeners that are coupled with JComponents.
		resetActionListener resetListener =  new resetActionListener(puzzleModel, jugButton1, jugButton2, jugButton3);
		textDisplayActionListener jugListener = new textDisplayActionListener(textDisplay, puzzleModel);
		jugMoveActionListener moveListener = new jugMoveActionListener(puzzleModel);
		exitActionListener exitListener = new exitActionListener();
		
		
		
		jugButton1.addActionListener(jugListener);
		jugButton2.addActionListener(jugListener);
		jugButton3.addActionListener(jugListener);
		jugButton1.addActionListener(moveListener);
		jugButton2.addActionListener(moveListener);
		jugButton3.addActionListener(moveListener);
		resetButton.addActionListener(resetListener);
		exitButton.addActionListener(exitListener);
		
		// Addition to JugPuzzle container
		puzzleContainer.add(jugButton1);
		puzzleContainer.add(jugButton2);
		puzzleContainer.add(jugButton3);
		puzzleContainer.add(new JLabel("Capacity: 8"));
		puzzleContainer.add(new JLabel("Capacity: 5"));
		puzzleContainer.add(new JLabel("Capacity: 3"));
		puzzleContainer.add(jugAmount0);
		puzzleContainer.add(jugAmount1);
		puzzleContainer.add(jugAmount2);
		
		// View observer objects.
		jugAmountView jugAmountView0 = new jugAmountView(jugAmount0,0);
		jugAmountView jugAmountView1 = new jugAmountView(jugAmount1,1);
		jugAmountView jugAmountView2 = new jugAmountView(jugAmount2,2);
		winView winView = new winView(jugButton1, jugButton2, jugButton3);
		movesView movesView = new movesView(numMoves);
		
		
		//addition of view observer objects to puzzleModel Observables.
		puzzleModel.addObserver(jugAmountView0);
		puzzleModel.addObserver(jugAmountView1);
		puzzleModel.addObserver(jugAmountView2);
		puzzleModel.addObserver(movesView);
		puzzleModel.addObserver(winView);
		resetListener.addObserver(jugAmountView0);
		resetListener.addObserver(jugAmountView1);
		resetListener.addObserver(jugAmountView2);
		resetListener.addObserver(movesView);
		resetListener.addObserver(winView);
		
		

	
		// Addition of more JComponents to JugPuzzle container.
		puzzleContainer.add(textDisplay);
		puzzleContainer.add(numMoves);
		puzzleContainer.add(winView);
		puzzleContainer.add(resetButton);
		puzzleContainer.add(exitButton);
		
		
	
	
		
		puzzleFrame.pack();
		puzzleFrame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
