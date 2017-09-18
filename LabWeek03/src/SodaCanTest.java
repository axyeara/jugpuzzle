import static org.junit.Assert.*;

import org.junit.Test;

public class SodaCanTest {

	@Test
	public void testOpen() {
		SodaCan canA = new SodaCan("Coke", false);
		SodaCan canB = new SodaCan("Coke", true);
		canA.open();
		canB.open();
		boolean resultA = canA.isOpen;
		boolean resultB = canB.isOpen;
		// assert statements
		assertEquals(true, resultA);
		assertEquals(true, resultB);
		
	}

	@Test
	public void testSip() {
		SodaCan canA = new SodaCan("Coke", true);
		canA.sip();
		SodaCan canB = new SodaCan("Coke", true);
		canB.amount = 5;
		int resultA = canA.amount;
		canB.sip();
		int resultB = canB.amount;
		// assert statements
		assertEquals(240, resultA);
		assertEquals(0, resultB);
	}

	@Test
	public void testGulp() {
		SodaCan canA = new SodaCan("Coke", true);
		canA.gulp();
		SodaCan canB = new SodaCan("Coke", true);
		canB.amount = 5;
		int resultA = canA.amount;
		canB.sip();
		int resultB = canB.amount;
		// assert statements
		assertEquals(200, resultA);
		assertEquals(0, resultB);
	}

}
