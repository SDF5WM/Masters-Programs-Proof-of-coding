package Module6All;

public class Flight {

		// TODO Auto-generated method stub
		private String airlineName;
		private int flightNumber;
		private String originCity;
		private String destinationCity;
		
		public Flight (String flight_name, int flight_number, String origin, String destination) {
			this.airlineName = flight_name;
			this.flightNumber = flight_number;
			this.originCity = origin;
			this.destinationCity = destination;
		}
		
		public String toString1() {
			return airlineName + flightNumber + originCity + destinationCity;
		}
	
public String getAirlineName() {
    return airlineName;
}

public void setAirlineName(String airlineName) {
    this.airlineName = airlineName;
}

public int getFlightNumber() {
    return flightNumber;
}

public void setFlightNumber(int flightNumber) {
    this.flightNumber = flightNumber;
}

public String getOrigin() {
    return getOrigin();
}

public void setOrigin(String origin) {
    this.originCity = origin;
}

public String getDestination() {
    return getDestination();
}

public void setDestination(String destination) {
    this.destinationCity =  destination;
}

@Override
public String toString() {
    return airlineName+" "+flightNumber+" from "+ originCity +" to "+ destinationCity;
}
}
