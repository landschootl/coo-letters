package letter.type;
import inhabitant.Inhabitant;
import letter.content.TextContent;

/**
 * Class which represents a simple letter containing a text content.
 * @author landschoot
 *
 */
public class SimpleLetter extends NotRegisteredLetter<TextContent>{

	/**
	 * Constructor of the class Simple Letter
	 * @param content
	 * @param sender
	 * @param receiver
	 */
	public SimpleLetter(String content, Inhabitant sender, Inhabitant receiver){
		super(new TextContent(content), sender, receiver);
	}
	
	/**
	 * This function return the price for send a Simpleletter.
	 */
	@Override
	public int getCost() {
		return BASE_COST;
	}
	
	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * this function show the description of SimpleLetter
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a simple letter "+this.content;
	}

}
