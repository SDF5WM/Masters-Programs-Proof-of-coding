package Module6All;

public class MovieTest {
	public static void main(String[] args) {

	 Movie f1 = new Movie("Spaceballs", "PG-13");
	 f1.addRating(5);
	 f1.addRating(4);
	 f1.addRating(5);
	 f1.addRating(4);
	 f1.addRating(3);
	 f1.addRating(5);
	 
	 Movie f2 = new Movie("Tarzan", "PG");
	 f2.addRating(5);
	 f2.addRating(4);
	 f2.addRating(5);
	  
	 System.out.println(f1.getName()+ " (" + f1.getMPAArating() + ") - " + f1.getAverageRating());
	 System.out.println(f2.getName()+ " (" + f2.getMPAArating() + ") - " + f2.getAverageRating()); 
		}
	}