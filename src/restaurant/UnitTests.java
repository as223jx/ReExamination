package restaurant;

import org.junit.Test;

public class UnitTests {
	
	@Test
	public void createChef() {
		Chef chef = new Chef();
		assertNotNull(chef);
	}
}