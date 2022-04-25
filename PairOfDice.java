package Module6All;

public class PairOfDice {
	public static void main(String[] args) {
		
		Die d1 = new Die(6);
		d1.getSides();
		d1.getValue();
		
		Die d2 = new Die(6);
		d2.getSides();
		d2.getValue();
		
		System.out.println("Your dice roll is: " + d1.getValue() + " and " + d2.getValue() + " respectively.");
	}
	
}
