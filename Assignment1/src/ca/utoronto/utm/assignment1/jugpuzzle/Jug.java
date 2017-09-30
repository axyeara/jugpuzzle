package ca.utoronto.utm.assignment1.jugpuzzle;

/**
 * @author csc207 student
 *
 *This class defines the Jug class used for the JugPuzzle.
 */
public class Jug {
	private int capacity;
	private int currentAmount;
	
	
	
	/**
	 * This method initializes a new Jug object with a specified liquid capacity and
	 * the current amount of units of liquid in it.
	 * 
	 * @param capacity Maximum possible amount of units of liquid in the Jug.
	 * @param currentAmount Current amount of units of liquid in the Jug.
	 */
	public Jug(int capacity, int currentAmount) {
		this.capacity = capacity;
		this.currentAmount = currentAmount;
	}
	
	/**
	 * @return Current amount of units of liquid in a Jug.
	 */
	public int getCurrentAmount() {
		return this.currentAmount;
	}
	
	/**
	 * Adds a given amount of units of liquid to the Jug. If the amount added makes
	 * the current amount of liquid exceed the capacity of the jug, no liquid is added.
	 * 
	 * @param amount Amount of units of liquid to be added to Jug.
	 * @return Amount of units of liquid that was added to the Jug.
	 */
	public int addLiquid(int amount) {
		if (amount + this.currentAmount > this.capacity) {
			amount = 0;
		}
		else {
			this.currentAmount += amount;
		}
		return amount;
	}
	
	/**
	 * Removes a given amount of units of liquid from the Jug. If the amount removed 
	 * makes the current amount of liquid less than zero, no liquid is removed.
	 * 
	 * @param amount Amount of units of liquid to be removed from the Jug.
	 * @return Amount of units of liquid that was removed from the Jug.
	 */
	public int removeLiquid(int amount) {
		if (this.currentAmount - amount < 0) {
			amount = 0;
		}
		else {
		this.currentAmount -= amount;
		}
		return amount;
	}
	
	/**
	 * A certain amount of units of liquid is removed from a Jug and transferred to the specified Jug.
	 * The amount of liquid transferred from the Jug depends on its current
	 * amount and the amount required to fill up the specified Jug.
	 * 
	 * @param toJug Jug to which a certain amount of units of liquid is added from another Jug.
	 */
	public void spillInto(Jug toJug) {
		int emptySpace = toJug.capacity - toJug.currentAmount;
		if (this.currentAmount >= emptySpace) {
			toJug.addLiquid(this.removeLiquid(emptySpace));
		}
		else {
			toJug.addLiquid(this.removeLiquid(this.currentAmount));
		}
	}
	
	
	/* 
	 * @ return String representation of a Jug instance.
	 */
	public String toString() {
		return "(" + this.currentAmount + "/" + this.capacity + ") ";
	}
}
