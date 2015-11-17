
public class BankAccount {
	protected double amount;
	protected Inhabitant owner;
	
	public BankAccount(Inhabitant owner) {
		this.owner = owner;
		this.amount = 0;
	}

	public BankAccount(double amount, Inhabitant owner) {
		this.amount = amount;
		this.owner = owner;
	}

	public double getAmount() {
		return amount;
	}

	public Inhabitant getOwner() {
		return owner;
	}
	
	public void debit(double amount) {
		this.amount -= amount;
	}
	
	public void credit(double amount) {
		this.amount += amount;
	}
	
}
