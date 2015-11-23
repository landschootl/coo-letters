package city;

import inhabitant.Inhabitant;

import java.util.List;

import letter.Letter;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<?>> postbox;
	
	public City(String name) {
		this.name = name;
		System.out.println("Creating "+name+" city");
	}

	public City(String name, List<Inhabitant> inhabitants) {
		this(name);
		this.inhabitants = inhabitants;
	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public String getName() {
		return name;
	}

	public void setPostbox(List<Letter<?>> postbox) {
		this.postbox = postbox;
	}
	
	public void addInhabitant(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
		System.out.println("Creating 1 inhabitant");
	}
	
	public void addInhabitants(int nbInhabitants){
		for(int i=1; i<nbInhabitants+1; i++)
			this.inhabitants.add(new Inhabitant("inhabitant-"+i, this));
		System.out.println("Creating "+nbInhabitants+" inhabitants");
	}
	
	public void sendLetter(Letter<?> letter){
		this.postbox.add(letter);
		letter.getSender().getBankAccount().debit(letter.getCost());
	}
	
	public void distributeLetters(){
		for(Letter<?> letter : postbox){
			letter.doAction();
			postbox.remove(letter);
		}
	}
	
	public void collectLetters(){
		int nbInhabitant = (int) (Math.random()*inhabitants.size());
		for(int i=0; i<nbInhabitant; i++){
			
		}
	}
	
}
