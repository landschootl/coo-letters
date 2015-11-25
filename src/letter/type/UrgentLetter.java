package letter.type;

import letter.Letter;

/**
 * Class which represents an urgent letter containing a letter content.
 * @author landschoot
 *
 */
public class UrgentLetter<T extends Letter<?>> extends DecoratorLetter<T>{

	public UrgentLetter(T letter) {
		super(letter, letter.getSender(), letter.getReceiver());
		// TODO Auto-generated constructor stub
		if(letter instanceof UrgentLetter)
			throw new IllegalArgumentException("Error type of letter invalide.");
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
