import city.City;

public class Main {
	public static void main(String []args) {		
		City city = new City("Annoeullin");
		city.addInhabitants(100);
		int kJours = 6;
		System.out.println("Mailing letters for "+kJours+" days");
		for(int k=0; k<kJours; k++){
			System.out.println("**************************************************************");
			System.out.println("Day "+(k+1));
			city.distributeLetters();
			city.collectLetters();
		}
	}

}
