package ca.utoronto.utm.assignment1.jugpuzzle;

/**
 * @author csc207 student
 *
 * This class defines a JugPuzzle composed by a certain number of Jug instances. This class
 * is used by the JugPuzzleController class.
 */
public class JugPuzzle {
	
	private int moveNumber;
	private Jug[] allJugs;
	private boolean isPuzzleSolved = false;
	
	/**
	 * This class initializes a JugPuzzle object composed by three different Jug objects
	 */
	public JugPuzzle() {
		allJugs = new Jug[3];
		allJugs[0] = new Jug(8,8);
		allJugs[1] = new Jug(5,0);
		allJugs[2] = new Jug(3,0);
	}

	/**
	 * @return Number of moves the user has made in the JugPuzzle
	 */
	public int getMoves() {
		return this.moveNumber;
	}
	
	/**
	 * Initiates a move in the JugPuzzle by transfering an amount of units
	 * of liquid from a specified Jug instance to another specified Jug instance.
	 * 
	 * @param x Number ID of the Jug that transfer a certain amount of units of liquid
	 * @param y Number ID of the Jug that is filled by a certain amount of units of liquid
	 */
	public void move(int x, int y) {
		int fromJugAmount = allJugs[x].getCurrentAmount();
		int toJugLeft = allJugs[y].getCapacity() - allJugs[y].getCurrentAmount();
		int toJugAmount = allJugs[y].getCurrentAmount();
	
		
		if (fromJugAmount != 0 && (toJugLeft > 0)) {
			if (fromJugAmount <= toJugLeft) {
				allJugs[y].setCurrentAmount(toJugAmount + fromJugAmount);
				allJugs[x].setCurrentAmount(0);	
				moveNumber++;
			}
			else {
				allJugs[y].setCurrentAmount(allJugs[y].getCapacity());
				allJugs[x].setCurrentAmount(fromJugAmount - toJugLeft);
				moveNumber++;
			}
		}
		
		if (allJugs[0].getCurrentAmount() == 4 && allJugs[1].getCurrentAmount() == 4) {
			this.isPuzzleSolved = true;
		}
	}
	/**
	 * @return Returns true if the puzzle is solved, returns false if otherwise.
	 */
	public boolean getIsPuzzleSolved() {
		return this.isPuzzleSolved;
	}
	
	/* 
	 * @return String representation of a JugPuzzle.
	 */
	public String toString() {
		return moveNumber + "  " + "0:" + allJugs[0].toString() + "1:" + allJugs[1].toString() + "2:" + allJugs[2].toString();
	}
}
