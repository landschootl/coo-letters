
public class Inhabitant {
	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name, City city, BankAccount bankAccount) {
		super();
		this.name = name;
		this.city = city;
		this.bankAccount = bankAccount;
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
