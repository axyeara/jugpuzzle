
/**
 * @author Alexander
 *
 */
public class SodaCan {
	
	public String type;
	public int amount;
	public boolean isOpen;
	
	
	/**
	 * This method initializes a SodaCan object
	 * 
	 * @param type    Stores the type of soda can
	 * @param isOpen  Stores whether the can is open or closed
	 */
	
	public SodaCan(String type, boolean isOpen) {
		this.type = type;
		this.amount = 250;
		this.isOpen = isOpen;
	}
	
	
	/**
	 * This method opens the can if it is closed. Remains open if 
	 * it was already opened.
	 */
	public void open() {
		if (!isOpen){
			this.isOpen = true;
		}
	}
	
	/** 
	 * This method decreases the amount of soda can by 10cc if the can was opened.
	 * If the amount of soda in the can is less than 10, then there will be no soda left.
	 * @return   Returns the amount of soda that was taken out of the can.
	 */
	public int sip() {
		if (this.isOpen && this.amount >= 10) {
			this.amount -= 10;
			return 10;
		}
		else if (this.isOpen && this.amount < 10) {
			int remainder = this.amount;
			this.amount = 0;
			return remainder;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * This method decreases the amount of soda can by 50cc if the can was opened.
	 * If the amount of soda in the can is less than 50, then there will be no soda left.
	 * @return    Returns the amount of soda that was taken out of the can.
	 */
	public int gulp() {
		if (this.isOpen && this.amount >= 50){
			this.amount -= 50;
			return 50;
		}
		else if (this.isOpen && this.amount < 50) {
			int remainder = this.amount;
			this.amount = 0;
			return remainder;
		}
		else {
			return 0;
		}
	}
	

	public String toString() {
		return "Soda type: " + this.type + ", Opened: " + this.isOpen + ", amount: " + this.amount;
	}
	

	public static void main(String[] args) {
		SodaCan can1 = new SodaCan("Sprite", false);
		SodaCan can2 = new SodaCan("Root Beer", true);
		SodaCan can3 = new SodaCan("Coke", true);
		can3.sip();
		can1.gulp();
		System.out.println(can3.amount);
		System.out.println(can1);
		can1.open();
		can1.gulp();
		System.out.println(can1);
		can2.sip();
		can2.gulp();
		System.out.println(can2);		
	}
}
