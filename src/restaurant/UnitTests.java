package restaurant;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTests {
	
	@Test
	public void createChef() {
		Chef chef = new Chef();
		assertNotNull(chef);
	}
}