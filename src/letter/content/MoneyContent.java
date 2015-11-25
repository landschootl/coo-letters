package letter.content;

/**
 * Class which represents the money contained in a letter.
 * @author landschoot
 *
 */
public class MoneyContent extends Content<Integer> {

	public MoneyContent(int amount) {
		super(amount);
	}
	
	public String toString(){
		// TODO Auto-generated method stub
		return "whose content is a money content (" + this.content + ")";
	}
	
}
