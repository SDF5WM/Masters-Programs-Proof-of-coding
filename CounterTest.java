package Module6All;

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	     Counter test = new Counter();
	    for (int x = 0; x < 8; x++) {
	    	 test.increaseCounter();
	    	 System.out.println(test.getCountValue());
	     }
	     test.tostringCount();
	   
	     for (int x = 8; x > 0; x--) {
	    	 test.decreaseCounter();
	    	 System.out.println(test.getCountValue());
	     }
	     test.tostringCount();
	}
}
