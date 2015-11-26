package letter.type;

import static org.junit.Assert.assertEquals;
import letter.LetterTest;

import org.junit.Test;

public class RegisterLetterTest extends LetterTest{
	
	public RegisteredLetter createLetter(){
		return new RegisteredLetter(new SimpleLetter("bla bla car", sender, receiver));
	}
	
	@Test
	public void receiverSendsAcknowledgment() {
		assertEquals(0, receiver.getCity().getPostbox().size());
		createLetter().doAction();
		assertEquals(1, receiver.getCity().getPostbox().size());
	}

	@Override
	public void testGetCost() {
		// TODO Auto-generated method stub
		assertEquals(16, letter.getCost());
	}

	@Override
	public void testDoAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testToString() {
		// TODO Auto-generated method stub
		assertEquals("a register letter whose content is a simple letter whose content is a text content (bla bla car)",letter.toString());
	}

}
