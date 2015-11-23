package letter.type;
import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.LetterContent;

public class RegisteredLetter extends Letter<LetterContent>{

	public RegisteredLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver){
		super(new LetterContent(content), sender, receiver);
	}
	
	@Override
	public double getCost() {
		return this.content.getLetter().getCost() + 15;
	}

	@Override
	public void reallyDoAction() {
		this.content.getLetter().doAction();
		SimpleLetter aknowledgment = new SimpleLetter ("Aknowlegment of receipt for a registered letter whose content is a"
														+this.getContent()+"whose content is"
														+this.getContent().getLetter().getContent().toString(), sender, receiver);
		this.receiver.getCity().sendLetter(aknowledgment);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a register letter "+this.content;
	}

}
