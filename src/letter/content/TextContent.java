package letter.content;

public class TextContent extends Content{
	protected String text;
	
	public TextContent(String text){
		super();
		this.text=text;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "whose content is a text content (" + this.text + ")";
	}
	
}
