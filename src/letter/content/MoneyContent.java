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
		return Double.toString(this.amount);
	}
	
}
