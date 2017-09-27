package ca.utoronto.utm.assignment1.jugpuzzle;

/**
 * @author csc207 student
 *
 * This class defines a JugPuzzle composed by a certain number of Jug instances. This class
 * is used by the JugPuzzleController class.
 */
public class JugPuzzle {
	private Jug Jug1;
	private Jug Jug2;
	private Jug Jug3;
	private boolean getIsPuzzleSolved;
	private int moves;
	
	/**
	 * This class initializes a JugPuzzle object composed by three different Jug objects
	 */
	public JugPuzzle() {
		this.Jug1 = new Jug(0, 8, 8);
		this.Jug2 = new Jug(1, 5, 0);
		this.Jug3 = new Jug(2, 3, 0);
	}

	/**
	 * @return Number of moves the user has made in the JugPuzzle
	 */
	public int getMoves() {
		//return
	}
	
	/**
	 * Initiates a move in the JugPuzzle by transfering an amount of units
	 * of liquid from a specified Jug instance to another specified Jug instance.
	 * 
	 * @param x Number ID of the Jug that transfer a certain amount of units of liquid
	 * @param y Number ID of the Jug that is filled by a certain amount of units of liquid
	 */
	public void move(int x, int y) {
		Jug fromJug;
		Jug toJug;
		Jug[] Jugs = new Jug[3];
		Jugs[0] = Jug1;
		Jugs[1] = Jug2;
		Jugs[2] = Jug3;
		for (Jug jug:Jugs) {
			if (jug.getNumberID() == x) {
				fromJug = jug;
			}
			if (jug.getNumberID() == y) {
				toJug = jug;
			}
		}
	}
	/**
	 * @return Returns the value of the isPuzzleSolved instance variable
	 */
	public boolean getIsPuzzleSolved() {
		return this.getIsPuzzleSolved;
	}
	
	public String toString() {
		return Jug1.toString() + Jug2.toString() + Jug3.toString();
	}
}
