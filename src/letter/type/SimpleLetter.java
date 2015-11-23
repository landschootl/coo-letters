package letter.type;
import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.TextContent;

public class SimpleLetter extends Letter<TextContent>{

	public SimpleLetter(String content, Inhabitant sender, Inhabitant receiver){
		super(new TextContent(content), sender, receiver);
	}
	
	@Override
	public double getCost() {
		return BASE_COST;
	}
	
	@Override
	public void reallyDoAction() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a simple letter "+this.content;
	}

}
