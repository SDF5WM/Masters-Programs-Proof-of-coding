package Module5All;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Module5a {

	public static void main(String[] args) {
		
		double average = 0, minnum = 0, maxnum = 0, range = 0, sum = 0;
		int nums;
		int i;	
		
		System.out.println("Enter 5 numbers for calculations. ");
		Scanner num = new Scanner(System.in);
		double[] inputArray;
		inputArray = new double[5];
		
		for (int Counter = 0; Counter < 5; Counter ++){
			inputArray[Counter] =  num.nextDouble();		
		}
		
		for (int aveCounter = 0; aveCounter < inputArray.length; aveCounter ++){
			sum = sum + inputArray[aveCounter];	
		}
		average = sum / 5; 
		System.out.println("The average is: " + average);
		//System.out.print("\n");
		
		maxnum = inputArray[0];
		for (int maxCounter = 0; maxCounter < inputArray.length; maxCounter ++){
			if (inputArray[maxCounter] > maxnum){
				maxnum = inputArray[maxCounter];
			}	
		}
		System.out.println("The largest value is: " + maxnum);
				
		minnum = inputArray[0];
		for (int minCounter = 0; minCounter < inputArray.length; minCounter ++){
			if (inputArray[minCounter] < minnum){
				minnum = inputArray[minCounter];
			}	
		}
		System.out.println("The smallest value is: " + minnum);
		System.out.println("The range is: " + (maxnum - minnum));
	}
}
		
		
		
		