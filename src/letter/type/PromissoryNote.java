package letter.type;
import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.MoneyContent;

public class PromissoryNote extends Letter<MoneyContent> {
	
	public PromissoryNote(double content, Inhabitant sender, Inhabitant receiver) {
		super(new MoneyContent(content), sender, receiver);
	}

	@Override
	public double getCost() {
		return BASE_COST + ((1/100)*this.content.getAmount());
	}

	@Override
	public void reallyDoAction() {
		this.sender.getBankAccount().debit(this.content.getAmount());
		this.receiver.getBankAccount().credit(this.content.getAmount());
		SimpleLetter thanksLetter = new SimpleLetter ("Thanks for a promissory note letter whose content is a money content"+this.content.getAmount(), receiver, sender);
		this.receiver.getCity().sendLetter(thanksLetter);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a promissory note letter "+this.content;
	}
	
}
