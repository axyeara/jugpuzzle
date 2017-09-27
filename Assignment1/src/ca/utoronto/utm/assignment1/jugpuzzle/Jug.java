package ca.utoronto.utm.assignment1.jugpuzzle;

/**
 * @author csc207 student
 *
 *This class defines the Jug class used for the JugPuzzle.
 */
public class Jug {
	private int capacity;
	private int numberID;
	private int currentAmount;
	
	/**
	 * This method initializes a new Jug object with a specified unit of liquid capacity,
	 * the current amount of unit of liquid in it, and its number ID.
	 * 
	 * @param capacity Amount of units of liquid in the jug.
	 */
	public Jug(int numberID, int capacity, int currentAmount) {
		this.capacity = capacity;
		this.numberID = numberID;
		this.currentAmount = currentAmount;
	}
	/**
	 * @return Amount of units of liquid in a Jug (capacity).
	 */
	public int getCapacity() {
		return this.capacity;
	}
	
	/**
	 * @return Number ID of the Jug object
	 */
	public int getNumberID() {
		return this.numberID;
	}
	 
	public String toString() {
		return this.numberID + ": " + "(" + this.currentAmount + "/" + this.capacity + ") ";
	}
}
