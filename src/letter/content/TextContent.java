package letter.content;

/**
 * Class which represents the text contained in a letter.
 * @author landschoot
 *
 */
public class TextContent extends Content<String>{
	
	public TextContent(String text){
		super(text);
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "whose content is a text content (" + this.content + ")";
	}
	
}
