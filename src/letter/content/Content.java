package letter.content;

/**
 * Class which represents the content of a letter.
 * @author landschoot
 *
 * @param <C>
 */
public abstract class Content<C> {
	protected C content;
	
	/**
	 * constructor of the class content
	 * @param content
	 */
	public Content(C content){
		this.content = content;
	}
	
	/**
	 * this 
	 * @return
	 */
	public C getContent() {
		return content;
	}
	
	/**
	 * function which represents the description of the content.
	 */
	public abstract String toString();

}