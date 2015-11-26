package letter;
import inhabitant.Inhabitant;
import letter.content.Content;

/**
 * Class which represents a letter.
 * @author landschoot
 *
 * @param <C> : extends Content<?>
 */
public abstract class Letter <C extends Content<?>> {
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected final int BASE_COST = 1;
	
	/**
	 * Constructor of the class Letter
	 * 
	 * @param content
	 * @param sender
	 * @param receiver
	 */
	public Letter(C content, Inhabitant sender, Inhabitant receiver){
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	/**
	 * function which returns the cost of the letter.
	 * @return int : the cost of the letter.
	 */
	public abstract int getCost();
	
	/**
	 * function which represents the action of the letter.
	 */
	public abstract void doAction();
	
	/**
	 * function which represents the description of the letter.
	 */
	public abstract String toString();

	public C getContent() {
		return content;
	}

	/**
	 * This method enable to change the Content of the letter
	 * @param content
	 */
	public void setContent(C content) {
		this.content = content;
	}

	/**
	 * This method return the sender of the letter
	 * @return sender
	 */
	public Inhabitant getSender() {
		return sender;
	}

	/**
	 * This method enable to change the sender of the letter
	 * @param sender
	 */
	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	
	/**
	 * This method return the receiver of the letter
	 * @return receiver
	 */
	public Inhabitant getReceiver() {
		return receiver;
	}

	/**
	 * This method enable to change the receiver of the letter
	 * @param receiver
	 */
	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}
	
}
