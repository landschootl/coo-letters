package bankAccount;

import static org.junit.Assert.*;
import inhabitant.Inhabitant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import city.City;

public class BankAccountTest {
	protected City city;
	protected Inhabitant inhabitant;
	protected BankAccount bankAccount;
	
	@Before
	public void setUp() throws Exception {
		city = new City("Lille");
		inhabitant = new Inhabitant("Ludovic", city);
		bankAccount = inhabitant.getBankAccount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		assertEquals(5000, bankAccount.getAmount());
		assertEquals(inhabitant, bankAccount.getOwner());
	}
	
	@Test
	public void testDebit() {
		bankAccount.debit(30);
		assertEquals(4970, bankAccount.getAmount());
	}
	
	@Test
	public void testCredit() {
		bankAccount.credit(50);
		assertEquals(5050, bankAccount.getAmount());
	}

}
