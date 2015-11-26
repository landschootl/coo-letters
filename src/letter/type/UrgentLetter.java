package letter.type;

import letter.Letter;
import letter.content.LetterContent;

/**
 * Class which represents an urgent letter containing a letter content.
 * @author landschoot
 *
 */
public class UrgentLetter extends Letter<LetterContent>{

	public UrgentLetter(NotUrgentLetter<?> letter) {
		super(new LetterContent(letter), letter.getSender(), letter.getReceiver());
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.content.getContent().getCost() * 2;
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		this.content.getContent().doAction();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "an urgent letter "+this.content;
	}

}
