package inhabitant;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import city.City;

public class InhabitantTest {
	protected City city;
	protected Inhabitant inhabitant;
	
	@Before
	public void setUp() throws Exception {
		city = new City("Lille");
		inhabitant = new Inhabitant("Ludovic", city);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		assertEquals("Ludovic", inhabitant.getName());
		assertEquals(city, inhabitant.getCity());
		assertNotNull(inhabitant.getBankAccount());
	}

}
