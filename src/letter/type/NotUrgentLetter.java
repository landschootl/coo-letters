package letter.type;

import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.Content;

public abstract class NotUrgentLetter<T extends Content<?>> extends Letter<T> {

	/**
	 * Constructor of the class NotUrgentLetter.
	 * @param letter
	 * @param sender
	 * @param receiver
	 */
	public NotUrgentLetter(T letter, Inhabitant sender, Inhabitant receiver) {
		super(letter, sender, receiver);
	}

}