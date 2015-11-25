package letter.type;

import static org.junit.Assert.assertEquals;
import inhabitant.Inhabitant;

import org.junit.Test;

import city.City;

public class RegisterLetterTest {
	City city = new City("Lens");
	Inhabitant sender = new Inhabitant("Amélie", city);
	Inhabitant receiver = new Inhabitant("Aylin", city);
	
	public RegisteredLetter createLetter(){
		return new RegisteredLetter(new SimpleLetter("bla bla car", sender, receiver));
	}
	
	@Test
	public void receiverSendsAcknowledgment() {
		assertEquals(0, receiver.getCity().getPostbox().size());
		createLetter().doAction();
		assertEquals(1, receiver.getCity().getPostbox().size());
	}

}
