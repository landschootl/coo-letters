package letter.content;
import letter.Letter;

/**
 * Class which represents the letter contained in a letter.
 * @author landschoot
 *
 */
public class LetterContent extends Content<Letter<?>>{

	/**
	 * Consctructor of the class LetterContent.
	 * @param letter
	 */
	public LetterContent(Letter<?> letter){
		super(letter);
	}

	/**
	 * this function show the description of LetterContent
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "whose content is " + this.content;
	}
	
}
