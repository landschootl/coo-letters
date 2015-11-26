package letter.content;

import static org.junit.Assert.assertEquals;
import inhabitant.Inhabitant;
import letter.Letter;
import letter.type.SimpleLetter;

import org.junit.After;
import org.junit.Before;

import city.City;

public class LetterContentTest extends ContentTest<Letter<?>, LetterContent>{
	protected City city;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	@Before
	public void setUp() throws Exception {
		city = new City("Lille");
		sender = new Inhabitant("Ludovic", city);
		receiver = new Inhabitant("Amelie", city);
		value = new SimpleLetter("bla bla", sender, receiver);
		content = new LetterContent(value);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Override
	public void testToString() {
		assertEquals("whose content is a simple letter whose content is a text content (bla bla)", content.toString());
	}

}
