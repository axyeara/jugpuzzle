public class SodaCan {
	
	private String type;
	private int amount;
	private boolean isOpen;
	
	public SodaCan(String type, boolean isOpen, int amount) {
		this.type = type;
		this.amount = 250;
		this.isOpen = isOpen;
	}
	
	public void open() {
		if !(opened){
			this.opened = true;
		}
	}
	public static int sip() {
		if (this.isOpen && this.amount >= 10) {
			this.amount -= 10;
			return 10;
		}
		else {
			int remainder = this.amount;
			this.amount = 0;
			return remainder
		}
	}
	
	public static int gulp() {
		if (this.isOpen && this.amount >= 50){
			this.amount -= 50;
			return 50;
		}
		else {
			int remainder = this.amount;
			this.amount = 0;
			return remainder;
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
		System.out.println(can3.amount);
	}

}
