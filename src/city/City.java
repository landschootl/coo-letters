package city;

import factoryMethod.LetterFactory;
import inhabitant.Inhabitant;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;

/**
 * Class which represents a city.
 * @author landschoot
 *
 */
public class City {
	protected String name;
	protected List<Inhabitant> inhabitants = new ArrayList<>();
	protected List<Letter<?>> postbox = new ArrayList<>();
	protected LetterFactory letterFactory = new LetterFactory();
	
	
	
	/**
	 * Constructor of City class. this one take only one parameter.
	 * @param owner
	 */
	public City(String name) {
		this.name = name;
		System.out.println("Creating "+name+" city");
	}
	
	/**
	 * function which add an inhabitant in the city. 
	 * @param inhabitant : the inhabitant to add.
	 */
	public void addInhabitant(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
		System.out.println("Creating 1 inhabitant");
	}
	
	/**
	 * function which add many inhabitants in the city. 
	 * @param nbInhabitants : the number of inhabitant to add.
	 */
	public void addInhabitants(int nbInhabitants){
		for(int i=1; i<nbInhabitants+1; i++)
			this.inhabitants.add(new Inhabitant("inhabitant-"+i, this));
		System.out.println("Creating "+nbInhabitants+" inhabitants");
	}

	/**
	 * function which sends a letter in a postbox. 
	 * @param letter : the letter to send. 
	 */
	public void sendLetter(Letter<?> letter){
		this.postbox.add(letter);
		System.out.print("-> "+letter.getSender().getName()+" mails "+letter+" to "+letter.getReceiver().getName()+" a cost of "+letter.getCost());
		if(letter.getCost()<=1) System.out.println(" euro"); else System.out.println(" euros");
		letter.getSender().getBankAccount().debit(letter.getCost());
	}
	
	/**
	 * function which represents the distribution of letters.
	 */
	public void distributeLetters(){
		List<Letter<?>> postboxSend = new ArrayList<>();
		for(int i=0; i<postbox.size(); i++){
			postboxSend.add(postbox.get(i));
		}
		for(int i=0; i<postboxSend.size(); i++){
			Letter<?> letter = postboxSend.get(i);
			System.out.println("<- "+letter.getReceiver().getName()+" receives "+letter+" from "+letter.getSender().getName());
			letter.doAction();
			this.postbox.remove(letter);
		}
	}
	
	/**
	 * function which represents the collect of letters.
	 */
	public void collectLetters(){
		int nbInhabitant = (int) (Math.random()*10+1);
		for(int i=0; i<nbInhabitant; i++){
			int idSender = (int) (Math.random()*inhabitants.size());
			int idReceiver;
			do{
				idReceiver = (int) (Math.random()*inhabitants.size());
			} while(idReceiver!=idSender);
			sendLetter(letterFactory.createAleaLetter(inhabitants.get(idSender), inhabitants.get(idReceiver)));
		}
	}
	
	/**
	 * function which indicates if the postbox is empty.
	 * @return boolean : if postbox is empty.
	 */
	public boolean postboxIsEmpty(){
		return postbox.isEmpty();
	}
	
	/**
	 * This function return Inhabitant array list
	 * @return inhabitants
	 */
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	/**
	 * This function return the name of the city
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This function return postbox array list
	 * @return postbox
	 */
	public List<Letter<?>> getPostbox() {
		return this.postbox;
	}
	
	public void setPostbox(List<Letter<?>> postbox) {
		this.postbox = postbox;
	}
	
}
