
public class Main {
	public static void main(String []args) {
		PromissoryNote letter = new PromissoryNote(25);
		RegisteredLetter letter2 = new RegisteredLetter(letter);
		System.out.println(letter2.getContent().getLetter().getContent());
	}

}
