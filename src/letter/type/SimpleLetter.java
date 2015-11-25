package letter.type;
import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.TextContent;

/**
 * Class which represents a simple letter containing a text content.
 * @author landschoot
 *
 */
public class SimpleLetter extends Letter<TextContent>{

	public SimpleLetter(String content, Inhabitant sender, Inhabitant receiver){
		super(new TextContent(content), sender, receiver);
	}
	
	@Override
	public int getCost() {
		return BASE_COST;
	}
	
	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a simple letter "+this.content;
	}

}
