package letter.content;

/**
 * Class which represents the money contained in a letter.
 * @author landschoot
 *
 */
public class MoneyContent extends Content<Integer> {

	/**
	 * Constructor of the class MoneyContent.
	 * @param amount
	 */
	public MoneyContent(int amount) {
		super(amount);
	}
	
	/**
	 * this function show the description of MoneyContent
	 */
	public String toString(){
		// TODO Auto-generated method stub
		return "whose content is a money content (" + this.content + ")";
	}
	
}
