package factoryMethod;

import inhabitant.Inhabitant;
import letter.Letter;
import letter.content.Content;
import letter.type.AknowledgmentLetter;
import letter.type.PromissoryNoteLetter;
import letter.type.RegisteredLetter;
import letter.type.SimpleLetter;
import letter.type.ThanksLetter;
import letter.type.UrgentLetter;

public class LetterFactory {
	private static LetterFactory instance = null;
	
	public static LetterFactory getInstance(){
		if(instance==null)
			instance=new LetterFactory();
		return instance;
	}
	
	public SimpleLetter createSimpleLetter(Inhabitant sender, Inhabitant receiver){
		return new SimpleLetter("bla bla", sender, receiver);
	}
	
	public ThanksLetter createTanksLetter(Inhabitant sender, Inhabitant receiver, int montant){
		return new ThanksLetter(sender, receiver, montant);
	}
	
	public AknowledgmentLetter createAknowledgmentLetter(Inhabitant sender, Inhabitant receiver, Content<?> content, Content<?> contentSup){
		return new AknowledgmentLetter(sender, receiver, content, contentSup);
	}
	
	public PromissoryNoteLetter createPromissoryNoteLetter(Inhabitant sender, Inhabitant receiver){
		return new PromissoryNoteLetter((int) (Math.random()*100)+1, sender, receiver);
	}
	
	public RegisteredLetter<?> createRegisteredLetter(Inhabitant sender, Inhabitant receiver){
		Letter<?> letter;
		if((int) (Math.random()*2)==0)
			letter = createSimpleLetter(sender, receiver);
		else
			letter = createPromissoryNoteLetter(sender, receiver);
		return new RegisteredLetter<Letter<?>>(letter);
	}
	
	public UrgentLetter<?> createUrgentLetter(Inhabitant sender, Inhabitant receiver){
		Letter<?> letter;
		int rand = (int) (Math.random()*3); 
		if(rand==0)
			letter = createSimpleLetter(sender, receiver);
		else if(rand==1)
			letter = createPromissoryNoteLetter(sender, receiver);
		else
			letter = createRegisteredLetter(sender, receiver);
		return new UrgentLetter<Letter<?>>(letter);
	}
	
	public Letter<?> createAleaLetter(Inhabitant sender, Inhabitant receiver){
		int rand = (int) (Math.random()*4); 
		if(rand==0)
			return createSimpleLetter(sender, receiver);
		else if(rand==1)
			return createPromissoryNoteLetter(sender, receiver);
		else if(rand==2)
			return createRegisteredLetter(sender, receiver);
		else
			return createUrgentLetter(sender, receiver);
	}
}
