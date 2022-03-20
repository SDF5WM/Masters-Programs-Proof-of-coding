package Module4All;

import java.util.Scanner;

public class Module4b {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input your employee name: ");
		Scanner nam = new Scanner(System.in);
		String name = nam.next();
	
		System.out.println("Input your hourly wage: ");
		Scanner wag = new Scanner(System.in);
		Double wage = wag.nextDouble();
		
		System.out.println("Input number of hours worked this week: ");
		Scanner hour = new Scanner(System.in);
		Double hours = hour.nextDouble();
		
		if ((double)hours <= 40) {
			System.out.println(wage * hours);			
		}
		else {
			double finalwage = (40 * wage) + ((hours-40) * wage * 1.5);
			System.out.println("Your final weekly wage with overtime is: " + finalwage);
		}
	}
}
