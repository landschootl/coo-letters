import letter.type.PromissoryNote;
import letter.type.RegisteredLetter;
import city.City;


public class Main {
	public static void main(String []args) {
		PromissoryNote letter = new PromissoryNote(25);
		RegisteredLetter letter2 = new RegisteredLetter(letter);
		System.out.println(letter2.getContent().getLetter().getContent());
		
		City city = new City("Annoeullin");
		city.addInhabitants(100);
		int kJours = 6;
		System.out.println("Mailing letters for "+kJours+" days");
		for(int k=0; k<kJours; k++){
			city.collectLetters();
			city.distributeLetters();
		}
	}

}
