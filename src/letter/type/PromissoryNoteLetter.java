package letter.type;
import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.MoneyContent;

/**
 * Class which represents a promissory note letter containing a money content.
 * @author landschoot
 *
 */
public class PromissoryNoteLetter extends Letter<MoneyContent> {
	
	public PromissoryNoteLetter(int content, Inhabitant sender, Inhabitant receiver) {
		super(new MoneyContent(content), sender, receiver);
	}

	@Override
	public int getCost() {
		return BASE_COST + (int)((1/100)*this.content.getContent());
	}

	@Override
	public void doAction() {
		this.sender.getBankAccount().debit(this.content.getContent());
		this.receiver.getBankAccount().credit(this.content.getContent());
		SimpleLetter thanksLetter = new ThanksLetter (receiver, sender,this.content.getContent());
		this.receiver.getCity().sendLetter(thanksLetter);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a promissory note letter "+this.content;
	}
	
}
