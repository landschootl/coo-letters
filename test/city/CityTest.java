package city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import inhabitant.Inhabitant;
import letter.type.SimpleLetter;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CityTest {
	protected City city;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected SimpleLetter letter;
	
	@Before
	public void setUp() throws Exception {
		city = new City("Lille");
		sender = new Inhabitant("Ludovic", city);
		receiver = new Inhabitant("Dylan", city);
		letter = new SimpleLetter("bla bla", sender, receiver);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		assertEquals("Lille", city.getName());
		assertNotNull(city.getInhabitants());
		assertEquals(0, city.getInhabitants().size());
		assertNotNull(city.getPostbox());
	}
	
	@Test
	public void stage1_testPostboxIsEmpty() {
		assertTrue(city.postboxIsEmpty());
	}
	
	@Test
	public void stage2_testAddInhabitant() {
		city.addInhabitant(sender);
		assertEquals(1, city.getInhabitants().size());
		city.addInhabitant(receiver);
		assertEquals(2, city.getInhabitants().size());
		assertEquals(sender, city.getInhabitants().get(0));
		assertEquals(receiver, city.getInhabitants().get(1));
	}
	
	@Test
	public void stage3_testAddInhabitants() {
		city.addInhabitants(98);
		System.out.println(city.getInhabitants().size());
		assertEquals(98, city.getInhabitants().size());
	}
	
	@Test
	public void stage4_testSendLetter() {
		city.sendLetter(letter);
		assertEquals(1, city.getPostbox().size());
		assertEquals(letter, city.getPostbox().get(0));
		assertEquals(4999, sender.getBankAccount().getAmount());
	}
	
	@Test
	public void stage5_testDistributeLetters() {
		city.distributeLetters();
		assertEquals(0, city.getPostbox().size());
	}
	
	@Test
	public void stage6_testCollectLetters() {
		city.addInhabitants(100);
		System.out.println(city.getInhabitants().size());
		city.collectLetters();
		System.out.println(city.getPostbox().size());
		boolean check = city.getPostbox().size() > 0 && city.getPostbox().size() < 11;
		assertTrue(check);
	}

}
