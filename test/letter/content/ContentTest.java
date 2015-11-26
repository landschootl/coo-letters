package letter.content;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class ContentTest<V, C extends Content<?>> {
	protected V value;
	protected C content;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		assertNotNull(content.getContent());
		assertEquals(value, content.getContent());
	}
	
	@Test
	public abstract void testToString();

}
