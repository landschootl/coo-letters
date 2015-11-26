package letter.type;
import letter.content.LetterContent;

/**
 * Class which represents a registered letter containing a letter content.
 * @author landschoot
 *
 */
public class RegisteredLetter extends NotUrgentLetter<LetterContent>{

	
	/**
	 * Constructor of the class RegisteredLetter.
	 * @param letter
	 */
	public RegisteredLetter(NotRegisteredLetter<?> letter){
		super(new LetterContent(letter), letter.getSender(), letter.getReceiver());
	}
	
	/**
	 * This function return the price for send a Registeredletter.
	 */
	@Override
	public int getCost() {
		return this.content.getContent().getCost() + 15;
	}

	
	/**
	 * This function enable to send an Aknowledgment message when the receiver receive a RegisteredLetter
	 * 
	 */
	@Override
	public void doAction() {
		this.content.getContent().doAction();
		SimpleLetter aknowledgment = new AknowledgmentLetter (receiver, sender,this.getContent(),this.getContent().getContent().getContent());
		this.sender.getCity().sendLetter(aknowledgment);
	}

	
	/**
	 * this function show the description of RegisteredLetter
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a register letter "+this.content;
	}

}
