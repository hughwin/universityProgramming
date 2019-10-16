
public class NumberOfPies {
	
	
	private int pies;
	private int numberOfPeople;
	
	public NumberOfPies(int pies, int numberOfPeople) {
		
		this.numberOfPeople = numberOfPeople;
		this.pies = pies;
		
	}
	
	public String howMuchDoesEachPersonGet() {
		
		return "There are " + (pies/numberOfPeople) + " pies each, and " + (pies % numberOfPeople) + " leftover.";
		
	}
	
}
