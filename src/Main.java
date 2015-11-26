import inhabitant.Inhabitant;
import letter.type.RegisteredLetter;
import letter.type.SimpleLetter;
import letter.type.UrgentLetter;
import city.City;

public class Main {
	public static void main(String []args) {		
		City city = new City("Annoeullin");
		city.addInhabitants(100);
		int kJours = 6;
		int k;
		System.out.println("Mailing letters for "+kJours+" days");
		for(k=0; k<kJours; k++){
			System.out.println("**************************************************************");
			System.out.println("Day "+(k+1));
			city.distributeLetters();
			city.collectLetters();
		}
		while(!city.postboxIsEmpty()){
			System.out.println("**************************************************************");
			System.out.println("Day "+(++k));
			city.distributeLetters();
		}
		
//		Tests question 18 :
//		Inhabitant sender = new Inhabitant("Ludovic", city);
//		Inhabitant receiver = new Inhabitant("Dylan", city);
//		UrgentLetter letter = new UrgentLetter(new SimpleLetter("bla bla", sender, receiver));
//		UrgentLetter letter2 = new UrgentLetter(new UrgentLetter(new SimpleLetter("bla bla", sender, receiver)));
//		UrgentLetter letter3 = new UrgentLetter(new RegisteredLetter(new SimpleLetter("bla bla", sender, receiver)));
//		RegisteredLetter letter4 = new RegisteredLetter(new SimpleLetter("bla bla", sender, receiver));
//		RegisteredLetter letter5 = new RegisteredLetter(new RegisteredLetter(new SimpleLetter("bla bla", sender, receiver)));
//		RegisteredLetter letter5 = new RegisteredLetter(new UrgentLetter(new SimpleLetter("bla bla", sender, receiver)));
	}

}
