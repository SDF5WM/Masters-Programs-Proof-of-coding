package Module3All;
/**
 * 
 */

/**
 * @author 18045
 *
 */
import java.util.Scanner;
public class Module3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner bucky = new Scanner (System.in);
	System.out.println("Enter a number in Meters to convert to Miles, Feet, and Inches ");
	double num, num_mi, num_ft, num_in;
	num = bucky.nextDouble();
	num_mi = 0.00062137*num;
	num_ft = 3.28084*num;
	num_in = (3.28084*num)*12;
	System.out.print(num_mi);
	System.out.println(" Miles");
	System.out.print(num_ft);
	System.out.println(" Feet");
	System.out.print(num_in);
	System.out.println(" Inches");
	} 
	
}

	
