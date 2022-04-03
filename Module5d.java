package Module5All;
import java.util.Scanner;
public class Module5d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		//int i, h;
		System.out.println("Time for a multiplication table");
		for (int i = 1; i <= (10); i++){
			
			for (int h = 1; h <= (10); h++){
				
				sum = i * h;
				System.out.print(" " + sum);
			}
		System.out.println(" " + sum + " ");
		}
	}
}
