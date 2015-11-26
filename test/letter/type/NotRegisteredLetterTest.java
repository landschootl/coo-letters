package letter.type;

import static org.junit.Assert.fail;
import letter.content.Content;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class NotRegisteredLetterTest<T extends Content<?>> extends NotUrgentLetterTest<T>{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
