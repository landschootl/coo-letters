package letter.type;
import letter.Letter;
import letter.content.LetterContent;

public class RegisteredLetter extends Letter<LetterContent>{

	public RegisteredLetter(Letter<?> content){
		super();
		this.content = new LetterContent(content);
	}
	
	@Override
	public double getCost() {
		return this.content.getLetter().getCost() + 15;
	}

	@Override
	public void doAction() {
		this.content.getLetter().doAction();
		SimpleLetter aknowledgment = new SimpleLetter ("Aknowlegment of receipt for a registered letter whose content is a"
														+this.getContent()+"whose content is"
														+this.getContent().getLetter().getContent().toString());
		this.receiver.getCity().sendLetter(aknowledgment);
	}

}
