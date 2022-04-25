package Module6All;

public class FlightTest {

	public static void main(String[] args) {
		        System.out.println("Flight 1");
		        Flight f1 = new Flight("United", 2056, "SRQ", "EWR");
		        System.out.println("F1: "+f1.toString());
		        f1.setDestination("DCA");
		        System.out.println("Redirect flight");
		        System.out.println("F1: "+f1.toString());
		        System.out.println();
		        System.out.println("Flight 2");
		        Flight f2 = new Flight("United", 1772, "MSY", "IAD");
		        System.out.println("F2: "+f2.toString());
		        f2.setFlightNumber(1234);
		        f2.setOrigin("IAD");
		        f2.setDestination("DEN");
		        System.out.println("Next flight");
		        System.out.println("F2: "+f2.toString());
		    }
		}
