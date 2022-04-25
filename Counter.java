package Module6All;

public class Counter {

		// TODO Auto-generated method stub
		private int count = 0;
		private int x = 0;
		
		public void increaseCounter() {
			count ++;
		}
		
		public void decreaseCounter() {
			
			if (count > 0) {
				count --;
			}else {
				System.out.println("Try again without a negative number");
				}		
			}
		
		public int getCountValue()
		{
			return count;
		}
		public void tostringCount()
		{
			System.out.println("The counter is: " + count);
		}
	}