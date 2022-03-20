package Module4All;
import java.util.Scanner;
public class Module4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your income: ");
		Scanner incom = new Scanner(System.in);
		double income = incom.nextDouble();
				
		final double income1 = (50000 * 0.01);
		double income2 = ((income-50000) * 0.02) + income1;
		double income3 = (((income-75000) * 0.03) + (25000 * 0.02) + (50000 * 0.01));
		double income4 = (((income-100000) * 0.04) + (25000 * 0.03) + (25000 * 0.02) + (50000 * 0.01));
		double income5 = (((income-250000) * 0.05) + (150000 * 0.04) + (25000 * 0.03) + (25000 * 0.02) + (50000 * 0.01));
		double income6 = (((income-500000) * 0.06) + (250000) * 0.05) + (150000 * 0.04) + (25000 * 0.03) + (25000 * 0.02) + (50000 * 0.01);
		
		if (income <= 50000) {
			System.out.println("Your total income tax is: " + (income *.01));
		}
		else if ((income > 50000) && (income <= 75000)){
			System.out.println("Your total income tax is: " + income2);
		}
		else if ((income > 75000) && (income <= 100000)){
			System.out.println("Your total income tax is: " + income3);
		}
		else if ((income > 100000) && (income <= 250000)){
			System.out.println("Your total income tax is: " + income4);
		}
		else if ((income > 250000) && (income <= 500000)){
			System.out.println("Your total income tax is: " + income5);
		}
		else if (income > 500000){
			System.out.println("Your total income tax is: " + income6);
		}
	}
}
