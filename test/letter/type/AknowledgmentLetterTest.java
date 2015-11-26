package letter.type;

import static org.junit.Assert.assertEquals;
import letter.Letter;

public class AknowledgmentLetterTest extends SimpleLetterTest{

	@Override
	public Letter<?> createLetter() {
		// TODO Auto-generated method stub
		RegisteredLetter registerLetter = new RegisteredLetter(new SimpleLetter("blop", sender, receiver));
		return new AknowledgmentLetter (receiver, sender, registerLetter.getContent(), registerLetter.getContent().getContent().getContent());
	}
	
	@Override
	public void testToString() {
		// TODO Auto-generated method stub
		assertEquals("an aknowledgment of receipt wich is a simple letter whose content is a text content (aknowlegment of receipt for a registered letter whose content is awhose content is a simple letter whose content is a text content (blop)whose content iswhose content is a text content (blop))", letter.toString());
	}

}
