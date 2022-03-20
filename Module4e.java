package Module4All;
import java.util.Scanner;
public class Module4e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is a leap year calculator. Please enter a year in YYYY format: ");
		Scanner leapyearcal = new Scanner(System.in);
		int leapyearcalc = leapyearcal.nextInt();
				
		if ((leapyearcalc % 4 == 0) || (leapyearcalc % 400 == 0)) {
			System.out.println(leapyearcalc + " is a leap year");
			return;
		}
		System.out.println(leapyearcalc + " is not a leap year");
					
		}
}
