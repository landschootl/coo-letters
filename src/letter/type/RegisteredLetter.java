package letter.type;
import letter.content.LetterContent;

/**
 * Class which represents a registered letter containing a letter content.
 * @author landschoot
 *
 */
public class RegisteredLetter extends NotUrgentLetter<LetterContent>{

	public RegisteredLetter(NotRegisteredLetter<?> letter){
		super(new LetterContent(letter), letter.getSender(), letter.getReceiver());
	}
	
	@Override
	public int getCost() {
		return this.content.getContent().getCost() + 15;
	}

	@Override
	public void doAction() {
		this.content.getContent().doAction();
		SimpleLetter aknowledgment = new AknowledgmentLetter (receiver, sender,this.getContent(),this.getContent().getContent().getContent());
		this.sender.getCity().sendLetter(aknowledgment);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a register letter "+this.content;
	}

}
