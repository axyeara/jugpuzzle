package ca.utoronto.utm.assignment1.jugpuzzle;

/**
 * @author csc207 student
 *
 * The Jug class implements Jug objects and related methods. Each object has a specified liquid capacity
 * and the current amount of liquid it holds. These objects will be the composition of the JugPuzzle class
 * and will be manipulated by the console user through the JugPuzzleController class.
 */
public class Jug {
	private int capacity;
	private int amount;
	
	
	
	/**
	 * This method initializes a new Jug object with a specified liquid capacity and
	 * the current amount of units of liquid in it.
	 * 
	 * @param capacity Maximum possible amount of units of liquid in the Jug.
	 * @param amount Current amount of units of liquid in the Jug.
	 */
	public Jug(int capacity, int amount) {
		this.capacity = capacity;
		this.amount = amount;
	}
	
	/**
	 * Returns the current amount of units of liquid in a Jug instance.
	 * 
	 * @return Current amount of units of liquid in a Jug instance.
	 */
	public int getAmount() {
		return this.amount;
	}
	
	/**
	 * Adds a given amount of units of liquid to the Jug. Intended as 
	 * a helper function for the spillInto() method.
	 * 
	 * @param numUnits Amount of units of liquid to be added to Jug.
	 * @return Amount of units of liquid that was added to the Jug.
	 */
	public int addLiquid(int numUnits) {
		this.amount += numUnits;
		return numUnits;
	}
	
	/**
	 * Removes a given amount of units of liquid from the Jug. Intended as
	 * a helper function for the spillInto() method.
	 * 
	 * @param numUnits Amount of units of liquid to be removed from the Jug.
	 * @return Amount of units of liquid that was removed from the Jug.
	 */
	public int removeLiquid(int numUnits) {
		this.amount -= numUnits;
		return numUnits;
	}
	
	/**
	 * A certain amount of units of liquid is removed from a Jug and transferred to the specified Jug.
	 * The amount of liquid transferred from the Jug depends on its current
	 * amount and the amount required to fill up the specified Jug.
	 * 
	 * @param toJug Jug to which a certain amount of units of liquid is added from another Jug.
	 */
	public void spillInto(Jug toJug) {
		int emptySpace = toJug.capacity - toJug.amount; // Amount of units of liquid required to fill a Jug to its capacity.
		if (this.amount >= emptySpace) {                             
			toJug.addLiquid(this.removeLiquid(emptySpace));
		}
		else {
			toJug.addLiquid(this.removeLiquid(this.amount));
		}
	}
	
	
	/* 
	 * @ return String representation of a Jug instance.
	 */
	public String toString() {
		return "(" + this.amount + "/" + this.capacity + ") ";
	}
}
