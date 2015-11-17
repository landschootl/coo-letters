
public abstract class Letter <C extends Content> {
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;

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
