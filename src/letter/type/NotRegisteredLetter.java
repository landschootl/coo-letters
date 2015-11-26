package letter.type;

import inhabitant.Inhabitant;
import letter.content.Content;

public abstract class NotRegisteredLetter<T extends Content<?>> extends NotUrgentLetter<T> {

	/**
	 * Constructor of the class NorRegisteresLetter.
	 * @param letter
	 * @param sender
	 * @param receiver
	 */
	public NotRegisteredLetter(T letter, Inhabitant sender, Inhabitant receiver) {
		super(letter, sender, receiver);
	}

}