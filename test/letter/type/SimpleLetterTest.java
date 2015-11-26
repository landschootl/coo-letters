package letter.type;

import static org.junit.Assert.assertEquals;
import letter.Letter;
import letter.LetterTest;

public class SimpleLetterTest extends LetterTest{

	@Override
	public Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return new SimpleLetter("bla bla test", sender, receiver);
	}

	@Override
	public void testGetCost() {
		// TODO Auto-generated method stub
		assertEquals(1, letter.getCost());
	}

	@Override
	public void testDoAction() {
		// TODO Auto-generated method stub
		assertEquals(true, true);
	}

	@Override
	public void testToString() {
		// TODO Auto-generated method stub
		assertEquals("a simple letter whose content is a text content (bla bla test)", letter.toString());
	}

}
