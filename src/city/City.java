package city;

import inhabitant.Inhabitant;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;
import letter.type.PromissoryNote;
import letter.type.RegisteredLetter;
import letter.type.SimpleLetter;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants = new ArrayList<>();
	protected List<Letter<?>> postbox = new ArrayList<>();
	
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
		System.out.println("-> "+letter.getSender().getName()+" mails "+letter+" to "+letter.getReceiver().getName()+" a cost of "+letter.getCost()+" euro");
		letter.getSender().getBankAccount().debit(letter.getCost());
	}
	
	public void distributeLetters(){
		for(int i=0; i<postbox.size(); i++){
			Letter<?> letter = postbox.get(i);
			letter.doAction();
			postbox.remove(letter);
		}
	}
	
	public void collectLetters(){
//		int nbInhabitant = (int) (Math.random()*inhabitants.size());
		int nbInhabitant = 3;
		for(int i=0; i<nbInhabitant; i++){
			int sender = (int) (Math.random()*inhabitants.size());
			int receiver = (int) (Math.random()*inhabitants.size());
			while(receiver==sender)
				receiver = (int) (Math.random()*inhabitants.size());
			int typeLetter = (int) (Math.random()*4);
			Letter<?> letter;
			if(typeLetter==0){
				letter = new SimpleLetter("Bla bla", inhabitants.get(sender), inhabitants.get(receiver));
			} else if(typeLetter==1){
				letter = new PromissoryNote(Math.random()*100+1, inhabitants.get(sender), inhabitants.get(receiver));
			} else if(typeLetter==2){
				letter = new RegisteredLetter(new SimpleLetter("Lol", inhabitants.get(sender), inhabitants.get(receiver)), inhabitants.get(sender), inhabitants.get(receiver));
			} else{
				letter = new RegisteredLetter(new PromissoryNote(Math.random()*100+1, inhabitants.get(sender), inhabitants.get(receiver)), inhabitants.get(sender), inhabitants.get(receiver));
			}
			sendLetter(letter);
		}
	}
	
}
