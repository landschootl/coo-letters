package letter.content;

/**
 * Class which represents the text contained in a letter.
 * @author landschoot
 *
 */
public class TextContent extends Content<String>{
	
	/**
	 * Constructor of the class TextContent
	 * @param text
	 */
	public TextContent(String text){
		super(text);
	}
	
	
	/**
	 * this function show the description of TextContent
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return "whose content is a text content (" + this.content + ")";
	}
	
}
