package Module3All;
/**
 * 
 */

/**
 * @author 18045
 *
 */
import java.util.Scanner;
public class Module3b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fuel = new Scanner(System.in);
		System.out.println("Enter amount of fuel in a 20gal vehicle tank. ");
		double fuell,mile_gal,fuell_price, cost_cien, far;
		fuell = fuel.nextDouble();
		if (fuell <= 20){
			Scanner fuel_eff = new Scanner (System.in);
			System.out.println("Enter the vehicle's fuel efficiency ratio, as x gallons per 1 mile");
			mile_gal = fuel_eff.nextDouble();
			Scanner fuel_price = new Scanner (System.in);
			System.out.println("Enter the price per one gallon of fuel ");
			fuell_price = fuel_price.nextDouble();
			cost_cien = mile_gal * 100;
			far = mile_gal * fuell;
			System.out.print(mile_gal);
			System.out.println(" miles per gallon.");
			System.out.print("The vehicle can currently drive: ");
			System.out.println(far);
			System.out.print("The cost to drive 100 miles: ");
			System.out.println(cost_cien);
		}else{
			System.out.print("Try again, at fuel =< 20 gallons");
			}
		}
}
