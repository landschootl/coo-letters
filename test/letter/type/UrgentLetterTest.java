package letter.type;

import inhabitant.Inhabitant;

import org.junit.Test;

import city.City;

public class UrgentLetterTest {
	City city = new City("Lens");
	Inhabitant sender = new Inhabitant("Amélie", city);
	Inhabitant receiver = new Inhabitant("Aylin", city);
	
	@Test
	public void whatAmITesting() {
		SimpleLetter simpleLetter = new SimpleLetter("bla bla", sender, receiver);
		UrgentLetter letter = new UrgentLetter(simpleLetter);
		
		//@SuppressWarnings("unused")
		//TextContent textContent = letter.getContent().getContent();
		System.out.println(letter.getContent().getContent());
	}
	
}
