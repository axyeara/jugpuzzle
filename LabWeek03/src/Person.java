/**
 * @author Alexander
 *
 */
public class Person {
	
	public String thirstStatus;
	public int amountDrunk;
	
	/**
	 * This method initializes a Person object.
	 * 
	 */
	public Person() {
		this.amountDrunk = 0;
		this.thirstStatus = "very thirsty";
	}

	/**
	 * This method takes sip() amount of soda from a SodaCan object and increases the
	 * drunk levels of the Person Object accordingly.
	 * @param sodacan  Stores a SodaCan object.
	 */
	public void sipFrom(Object sodacan) {
		this.amountDrunk += ((SodaCan) sodacan).sip();
		if (this.amountDrunk >= 175 && this.amountDrunk < 375) {
			this.thirstStatus = "thirsty";
		}
		else if (this.amountDrunk >= 375) {
			this.thirstStatus = "satisfied";
		}
	}
	
	/**
	 * This method takes gulp() amount of soda from a SodaCan object and increases the
	 * drunk levels of the Person Object accordingly.
	 * @param sodacan  Stores a SodaCan object.
	 */
	public void gulpFrom(Object sodacan) {
		this.amountDrunk += ((SodaCan) sodacan).gulp();
		if (this.amountDrunk >= 175 && this.amountDrunk < 375) {
			this.thirstStatus = "thirsty";
		}
		else if (this.amountDrunk >= 375) {
			this.thirstStatus = "satisfied";
		}
	}
	
	/**
	 * @return   returns the "Thirst Status" of the Person object.
	 */
	public String getThirstStatus() {
		return this.thirstStatus;
	}
	
	public String toString() {
		return "Thirst status: " + this.thirstStatus + ", Drunkness: " + this.amountDrunk;
	}

	public static void main(String[] args) {
		SodaCan canA = new SodaCan("Sprite",false);
		SodaCan canB = new SodaCan("Coke", false);
		SodaCan canC = new SodaCan("Root Beer", true);
		Person personA = new Person();
		Person personB = new Person();
		canA.open();
		canB.open();
		personA.sipFrom(canA);
		System.out.println(personB);
		personB.gulpFrom(canB);
		personB.gulpFrom(canB);
		personB.gulpFrom(canB);
		personB.gulpFrom(canB);
		System.out.println(personB);
		System.out.println(canB);
		for (int i = 1; i < 5; i++) {
			personB.gulpFrom(canC);
		}
		System.out.println(personB);
		System.out.println(canB);
		System.out.println(canC);
	}
}
