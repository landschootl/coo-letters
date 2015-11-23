package letter;
import inhabitant.Inhabitant;
import letter.content.Content;

public abstract class Letter <C extends Content> {
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected final float BASE_COST = 1;
	
	public Letter(C content){
		this.content = content;
	}
	
	public C getContent() {
		return content;
	}

	public void setContent(C content) {
		this.content = content;
	}

	public Inhabitant getSender() {
		return sender;
	}

	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}

	public abstract double getCost();
	
	public abstract void doAction();
}
