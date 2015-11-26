package letter.type;

import letter.Letter;
import letter.content.LetterContent;

/**
 * Class which represents an urgent letter containing a letter content.
 * @author landschoot
 *
 */
public class UrgentLetter extends Letter<LetterContent>{

	/**
	 * Constructor of the class UrgentLetter.
	 * @param letter
	 */
	public UrgentLetter(NotUrgentLetter<?> letter) {
		super(new LetterContent(letter), letter.getSender(), letter.getReceiver());
		// TODO Auto-generated constructor stub
	}

	/**
	 * This function return the price for send an Urgentletter.
	 */
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

	/**
	 * this function show the description of UrgentLetter
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "an urgent letter "+this.content;
	}

}
