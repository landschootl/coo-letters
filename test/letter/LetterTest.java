package letter;

import inhabitant.Inhabitant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import city.City;

public abstract class LetterTest {
	protected City city;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected Letter<?> letter;
	
	@Before
	public void setUp() throws Exception {
		city = new City("Lille");
		sender = new Inhabitant("Ludovic", city);
		receiver = new Inhabitant("Dylan", city);
		letter = createLetter();
	}
	
	public abstract Letter<?> createLetter();

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public abstract void testGetCost();
	
	@Test
	public abstract void testDoAction();
	
	@Test
	public abstract void testToString();

}
