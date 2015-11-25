package letter.type;
import letter.Letter;

/**
 * Class which represents a registered letter containing a letter content.
 * @author landschoot
 *
 */
public class RegisteredLetter<T extends Letter<?>> extends DecoratorLetter<T>{

	public RegisteredLetter(T letter){
		super(letter, letter.getSender(), letter.getReceiver());
		if(letter instanceof UrgentLetter || letter instanceof RegisteredLetter)
			throw new IllegalArgumentException("letter is an UrgentLetter");
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
