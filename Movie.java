package Module6All;

public class Movie {

	private String  movieName;  
    private String MPAArating; //(e.g. G, PG, PG-13, R)  
    private int rate1Terrible;
    private int rate2Bad;
    private int rate3OK;
    private int rate4Good;
    private int rate5Great;
    
    public Movie(String movieName, String MPAArating) {
    	this.movieName = movieName;
    	this.MPAArating = MPAArating;
    	this.rate1Terrible = 0;
    	this.rate2Bad = 0;
    	this.rate3OK = 0;
    	this.rate4Good = 0;
    	this.rate5Great = 0;
    }
    public String getName() {
    	return movieName;
    }
     public void setName(String movieName) {
    	 this.movieName = movieName;
    }
    public String getMPAArating() {
    	return MPAArating;
    }
    public void setMPAArating(String MPAArating) {
    	this.MPAArating = MPAArating;
    }
    public void addRating (int rating) {
    	switch(rating) {
    	case 1:
    		rate1Terrible++;
    		break;
    	case 2:
    		rate2Bad++;
    		break;
    	case 3:
    		rate3OK++;
        	break;
        case 4:
            rate4Good++;
            break;
        case 5:
    		rate5Great++;
    		break;
    	default:
    		System.out.println("Remember the rating is 1-5");
    	}
    }
    public double getAverageRating() {
    	return 1.0*(rate1Terrible + 2* rate2Bad + 3* rate3OK + 4* rate4Good + 5* rate5Great)/(rate1Terrible + rate2Bad + rate3OK + rate4Good + rate5Great);
    }
}
