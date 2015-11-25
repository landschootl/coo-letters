package inhabitant;
import bankAccount.BankAccount;
import city.City;

/**
 * Class which represents an inhabitants.
 * @author landschoot
 *
 */
public class Inhabitant {
	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name, City city) {
		super();
		this.name = name;
		this.city = city;
		this.bankAccount = new BankAccount(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	

}
