package letter.type;
import inhabitant.Inhabitant;
import letter.content.MoneyContent;

/**
 * Class which represents a promissory note letter containing a money content.
 * @author landschoot
 *
 */
public class PromissoryNoteLetter extends NotRegisteredLetter<MoneyContent>{
	
	/**
	 * Constructor of the class PromissoryNoteLetter
	 * @param amount
	 * @param sender
	 * @param receiver
	 */
	public PromissoryNoteLetter(int amount, Inhabitant sender, Inhabitant receiver) {
		super(new MoneyContent(amount), sender, receiver);
	}

	
	/**
	 * This function return the price for send a PromossoryNoteLetter.
	 */
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
	
	
	/**
	 * this function show the description of promissoryLetter
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a promissory note letter "+this.content;
	}
	
}
