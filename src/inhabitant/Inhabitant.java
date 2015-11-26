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
	
	/**
	 * Consctructor of the class Inhabitant. 
	 * @param name
	 * @param city
	 */
	public Inhabitant(String name, City city) {
		super();
		this.name = name;
		this.city = city;
		this.bankAccount = new BankAccount(this);
	}

	/**
	 * This method return the name of the inhabitant
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * This method enable to change the name of the inhabitant
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method return the city of the inhabitant
	 * @return city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * This method enable to change the city of the inhabitant
	 * @param city
	 */
	public void setCity(City city) {
		this.city = city;
	}

	
	/**
	 * This method return the BankAccount of the inhabitant
	 * @return BankAccount
	 */
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	
	/**
	 * This method enable to change the BankAccount of the inhabitant
	 * @param BankAccount
	 */
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	

}
