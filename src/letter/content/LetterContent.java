package letter.content;
import letter.Letter;

/**
 * Class which represents the letter contained in a letter.
 * @author landschoot
 *
 */
public class LetterContent extends Content<Letter<?>>{

	public LetterContent(Letter<?> letter){
		super(letter);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "whose content is " + this.content;
	}
	
}
