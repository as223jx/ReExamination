package restaurant;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTests {
	
	@Test
	public void createChef() {
		Chef chef = new Chef();
		assertNotNull(chef);
	}
	
	@Test
	public void testUncookedEgg() {
		Egg egg = new Egg();
		assertFalse(egg.cooked);
	}
	
	@Test
	public void testScrambleEgg() {
		Egg egg = new Egg();
		egg.scramble();
		assertTrue(egg.scrambled);
		assertTrue(egg.cooked);
	}
	
}