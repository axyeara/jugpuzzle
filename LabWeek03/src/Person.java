public class Person {
	
	private String thirstStatus;
	private int amountDrunk;
	
	public Person(String thirstStatus, int amountDrunk) {
		this.amountDrunk = amountDrunk;
		this.thirstStatus = "very thirsty";
		

	public void sipFrom(Object sodacan) {
		amountDrunk += sodacan.sip();
	}
	
	public void gulpFrom(Object sodacan) {
		amountDrunk += sodacan.gulp();
	}
	
	public String getThirstStatus() {
		return this.thirstStatus;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
