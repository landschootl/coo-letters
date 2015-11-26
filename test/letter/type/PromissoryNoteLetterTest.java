package letter.type;

import static org.junit.Assert.assertEquals;
import letter.Letter;
import letter.LetterTest;

public class PromissoryNoteLetterTest extends LetterTest{

	@Override
	public Letter<?> createLetter() {
		// TODO Auto-generated method stub
		return new PromissoryNoteLetter(10, sender, receiver);
	}

	@Override
	public void testGetCost() {
		// TODO Auto-generated method stub
		assertEquals(1, letter.getCost());
	}

	@Override
	public void testDoAction() {
		// TODO Auto-generated method stub
		assertEquals(5000, sender.getBankAccount().getAmount());
		assertEquals(5000, receiver.getBankAccount().getAmount());
		letter.doAction();
		assertEquals(4990, sender.getBankAccount().getAmount());
		assertEquals(5009, receiver.getBankAccount().getAmount());
	}

	@Override
	public void testToString() {
		// TODO Auto-generated method stub
		assertEquals("a promissory note letter whose content is a money content (10)", letter.toString());
	}

}
