package letter.content;

public class MoneyContent extends Content {
	protected double amount;

	public MoneyContent(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	public String toString(){
		// TODO Auto-generated method stub
		return "whose content is a money content (" + this.amount + ")";
	}
	
}
