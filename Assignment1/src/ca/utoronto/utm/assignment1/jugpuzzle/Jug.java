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
	 * This method initializes a new Jug object with a specified units of liquid capacity and
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
	 * @return Maximum possible amount of units of liquid in a Jug (capacity).
	 */
	public int getCapacity() {
		return this.capacity;
	}
	
	/**
	 * @return Current amount of units of liquid in a Jug.
	 */
	public int getCurrentAmount() {
		return this.currentAmount;
	}
	
	/**
	 * Sets the current amount of units of liquid in a Jug to a specified quantity. If
	 * the amount of liquid is greater than the capacity of the Jug, and error message will appear.
	 * 
	 * @param amount Amount of units of liquid
	 */
	public void setCurrentAmount(int amount) {
		if (amount <= this.capacity) {
			this.currentAmount = amount;
		}
		else {
			System.out.println("Jug can't can't hold that much liquid, try setting another amount");
		}
	}
	
	/* 
	 * @ return String representation of a Jug instance.
	 */
	public String toString() {
		return "(" + this.currentAmount + "/" + this.capacity + ") ";
	}
}
