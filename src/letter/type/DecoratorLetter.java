package letter.type;

import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.LetterContent;

public abstract class DecoratorLetter<T extends Letter<?>> extends Letter<LetterContent> {
	
	public DecoratorLetter(T letter, Inhabitant sender, Inhabitant receiver) {
		super(new LetterContent(letter), sender, receiver);
	}

}