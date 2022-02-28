package Module3All;
/**
 * 
 */

/**
 * @author 18045
 *
 */
import java.util.Scanner;
public class Module3c {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a five digit number: ");
		int numb = num.nextInt();
		String integer = "" + numb + "";
		char c;
		for (int i = 0; i < integer.length(); i++) {
			c = integer.charAt(i);
			System.out.println(c);	
		}
	}
}