package restaurant;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

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
	
	@Test
	public void testBoilEgg() {
		Egg egg = new Egg();
		egg.boil();
		assertTrue(egg.boiled);
		assertTrue(egg.cooked);
	}
	
	@Test
	public void testChefScramblesEgg() {
		Chef chef = new Chef();
		Egg egg = Mockito.mock(Egg.class);
		chef.scrambleEgg(egg);
		Mockito.verify(egg, Mockito.times(1)).scramble();
	}
	
	@Test (expected = IllegalStateException.class)
	public void testBoilCookedEgg() {
		Egg egg = new Egg();
		egg.scramble();
		egg.boil();
	}
	
	@Test (expected = IllegalStateException.class)
	public void testScrambleCookedEgg() {
		Egg egg = new Egg();
		egg.boil();
		egg.scramble();
	}
}