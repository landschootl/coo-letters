
public class LetterContent extends Content{
	protected Letter<?> letter;

	

	public Letter<?> getLetter() {
		return letter;
	}



	public LetterContent(Letter<?> letter){
		super();
		this.letter= letter;
	}
}
