import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testSipFrom() {
		Person personA = new Person();
		SodaCan canA = new SodaCan("Coke", true);
		personA.sipFrom(canA);
		int amountleft = canA.amount;
		int drunkness = personA.amountDrunk;
		// assert statements
		assertEquals(240, amountleft);
		assertEquals(10, drunkness);
	}

	@Test
	public void testGulpFrom() {
		Person personA = new Person();
		SodaCan canA = new SodaCan("Coke", true);
		personA.gulpFrom(canA);
		int amountleft = canA.amount;
		int drunkness = personA.amountDrunk;
		// assert statements
		assertEquals(200, amountleft);
		assertEquals(50, drunkness);
	}

	@Test
	public void testGetThirstStatus() {
		Person personA = new Person();
		SodaCan canA = new SodaCan("Coke", true);
		for (int i = 1; i < 5; i++) {
			personA.gulpFrom(canA);
		}
		String thirst = personA.getThirstStatus();
		// assert statements
		assertEquals("thirsty", thirst);
	}

}
