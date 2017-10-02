package ca.utoronto.utm.assignment1.jugpuzzle;

/**
 * @author csc207 student
 *
 * The JugPuzzle class implements JugPuzzle objects and related methods. These objects are
 * composed of three Jug objects from the Jug class. The JugPuzzle objects are played by 
 * the console user with the help of the JugPuzzleController class.
 * 
 */
public class JugPuzzle {
	
	private int moveNum;
	private Jug[] allJugs;
	private boolean isPuzzleSolved;

	
	/**
	 * This class initializes a JugPuzzle object composed by three different Jug objects.
	 * The solved state of the JugPuzzle object is first set to false.
	 */
	public JugPuzzle() {
		this.allJugs = new Jug[3];
		this.allJugs[0] = new Jug(8,8);
		this.allJugs[1] = new Jug(5,0);
		this.allJugs[2] = new Jug(3,0);
		this.isPuzzleSolved = false;
	}

	/**
	 * Returns the number of moves the user has made in the JugPuzzle.
	 * 
	 * @return Number of moves the user has made in the JugPuzzle.
	 */
	public int getMoves() {
		return this.moveNum;
	}
	
	/**
	 * Initiates a move in the JugPuzzle by transfering an amount of units
	 * of liquid from a specified Jug instance to another specified Jug instance. The total
	 * amount of moves the user has made increases by 1. If the user wins in this move, the
	 * JugPuzzle's solved state is set to true.
	 * 
	 * @param from Number ID of the Jug that transfer a certain amount of units of liquid.
	 * @param to Number ID of the Jug that is filled by a certain amount of units of liquid.
	 */
	
	public void move(int from, int to) {
		Jug fromJug = this.allJugs[from];
		Jug toJug = this.allJugs[to];
		fromJug.spillInto(toJug);
		moveNum++;
		if (this.allJugs[0].getAmount() == 4 && this.allJugs[1].getAmount() == 4) {
			this.isPuzzleSolved = true;
		}
	}
	
	/**
	 * Returns true if the JugPuzle instance is solved. Returns false if otherwise.
	 * 
	 * @return Returns true if the JugPuzzle instance is solved. Returns false if otherwise.
	 */
	
	public boolean getIsPuzzleSolved() {
		
		return this.isPuzzleSolved;
	}
	
	
	/**
	 * Returns an array of Jugs from JugPuzzle instance.
	 * 
	 * @return An array of Jugs from JugPuzzle instance.
	 */
	public Jug[] getAllJugs() {
		return this.allJugs;
	}
		
	
	/* 
	 * @return String representation of a JugPuzzle.
	 */
	public String toString() {
		return this.moveNum + "  " + "0:" + allJugs[0].toString() + "1:" + allJugs[1].toString() + "2:" + allJugs[2].toString();
	}
}
