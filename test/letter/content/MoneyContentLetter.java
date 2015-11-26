package letter.content;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class MoneyContentLetter extends ContentTest<Integer, MoneyContent>{

	@Before
	public void setUp() throws Exception {
		value = 10;
		content = new MoneyContent(value);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Override
	public void testToString() {
		assertEquals("whose content is a money content (10)", content.toString());
	}

}
