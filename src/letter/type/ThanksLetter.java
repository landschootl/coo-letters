package letter.type;

import inhabitant.Inhabitant;

/**
 * Class which represents a thanks letter which is a simple letter.
 * @author landschoot
 *
 */
public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(Inhabitant sender, Inhabitant receiver, double montant) {
		super("thanks for a promissory note letter whose content is a money content"+montant, sender, receiver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a thanks letter wich is a simple letter "+this.content;
	}

}
