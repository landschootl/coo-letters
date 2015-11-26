package bankAccount;

import inhabitant.Inhabitant;

/**
 * Class which represents the bank account of the inhabitant.
 * @author landschoot
 *
 */
public class BankAccount {
	protected int amount;
	protected Inhabitant owner;
	
	/**
	 * First constructor of the class BankAccount. this one take only one parameter.
	 * @param owner
	 */
	public BankAccount(Inhabitant owner) {
		this.owner = owner;
		this.amount = 5000;
	}

	/**
	 * Second constructor of the BankAccount. this one take two parameter.
	 * @param amount
	 * @param owner
	 */
	public BankAccount(int amount, Inhabitant owner) {
		this.amount = amount;
		this.owner = owner;
	}
	
	/**
	 * function which debits an amount from a bank account.
	 * @param amount : the amount to remove.
	 */
	public void debit(int amount) {
		this.amount -= amount;
		System.out.println(" - "+amount+" are debited from "+owner.getName()+" account whose balance is now "+this.amount+ " euros");
	}
	
	/**
	 * function which credit an amount to a bank account.
	 * @param amount : the amount to add.
	 */
	public void credit(int amount) {
		this.amount += amount;
		System.out.println(" + "+owner.getName()+" account is credited with "+amount+" euros; its balance is now "+this.amount+ " euros");
	}
	
	/**
	 * function which return the amount 
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * function which return the Owner
	 * @return owner
	 */
	public Inhabitant getOwner() {
		return owner;
	}
	
}
