package letter.type;

import letter.LetterTest;
import letter.content.Content;

import org.junit.After;
import org.junit.Before;

public abstract class NotUrgentLetterTest<T extends Content<?>> extends LetterTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

}
