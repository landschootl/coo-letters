package letter.content;

/**
 * Class which represents the content of a letter.
 * @author landschoot
 *
 * @param <C>
 */
public abstract class Content<C> {
	protected C content;
	
	public Content(C content){
		this.content = content;
	}
	
	public C getContent() {
		return content;
	}
	
	/**
	 * function which represents the description of the content.
	 */
	public abstract String toString();

}