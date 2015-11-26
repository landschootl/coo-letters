package letter.content;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class TextContentTest extends ContentTest<String, TextContent>{

	@Before
	public void setUp() throws Exception {
		value = "bla bla";
		content = new TextContent(value);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Override
	public void testToString() {
		// TODO Auto-generated method stub
		assertEquals("whose content is a text content (bla bla)", content.toString());
	}

}
