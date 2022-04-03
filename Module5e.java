package Module5All;

import java.util.Random;
public class Module5e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		int random_numb = 0;
		Random random_num = new Random();
					
		for (int count = 0; count <= 100; count ++) {
			random_numb = random_num.nextInt(4) + 1;				
			switch (random_numb){
						
				case 1: 
						x = x+1;
						//count++;
						break;
				case 2:
						x = x+-1;
						//count++;
						break;
				case 3:
						y = y+1;
						//count++;
						break;
				case 4: 
						y = y+-1;
						//count++;
						break;
				}//end switch	
		}//end forloop
	System.out.print("Final coordinates are: " + x + "," + y);
	}
}
