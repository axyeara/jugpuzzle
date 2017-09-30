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

	
	/**
	 * This class initializes a JugPuzzle object composed by three different Jug objects.
	 */
	public JugPuzzle() {
		allJugs = new Jug[3];
		allJugs[0] = new Jug(8,8);
		allJugs[1] = new Jug(5,0);
		allJugs[2] = new Jug(3,0);
	}

	/**
	 * @return Number of moves the user has made in the JugPuzzle.
	 */
	public int getMoves() {
		return this.moveNumber;
	}
	
	/**
	 * Initiates a move in the JugPuzzle by transfering an amount of units
	 * of liquid from a specified Jug instance to another specified Jug instance, while
	 * increasing the number of moves made in the puzzle.
	 * 
	 * @param from Number ID of the Jug that transfer a certain amount of units of liquid.
	 * @param to Number ID of the Jug that is filled by a certain amount of units of liquid.
	 */
	
	public void move(int from, int to) {
		Jug fromJug = allJugs[from];
		Jug toJug = allJugs[to];
		spill(fromJug, toJug);
		moveNumber++;
	}
	
	/**
	 * @return Returns true if the JugPuzzle is solved. Returns false if otherwise.
	 */
	public boolean isPuzzleSolved() {
		
		return allJugs[0].getCurrentAmount() == 4 && allJugs[1].getCurrentAmount() == 4;
	}
	
	/**
	 * A certain amount of units of liquid is removed from a specified Jug and transferred to another
	 * specified Jug. The amount of liquid transferred from the specified Jug depends on its current
	 * amount and the amount required to fill up the specified Jug.
	 * 
	 * @param fromJug Jug to which a certain amount of units of liquid is removed.
	 * @param toJug Jug to which a certain amount of units of liquid will be added.
	 */
	public void spill(Jug fromJug, Jug toJug) {
		fromJug.spillInto(toJug);
	}
	
	/**
	 * @return An array of Jugs from JugPuzzle.
	 */
	public Jug[] getAllJugs() {
		return this.allJugs;
	}
		
	
	/* 
	 * @return String representation of a JugPuzzle.
	 */
	public String toString() {
		return this.moveNumber + "  " + "0:" + allJugs[0].toString() + "1:" + allJugs[1].toString() + "2:" + allJugs[2].toString();
	}
}
