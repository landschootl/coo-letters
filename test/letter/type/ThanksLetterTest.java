package letter.type;

import static org.junit.Assert.assertEquals;
import letter.Letter;

public class ThanksLetterTest extends SimpleLetterTest{

	@Override
	public Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return new ThanksLetter(sender, receiver, 10);
	}
	
	@Override
	public void testToString() {
		// TODO Auto-generated method stub
		assertEquals("a thanks letter wich is a simple letter whose content is a text content (thanks for a promissory note letter whose content is a money content 10.0)", letter.toString());
	}

}
