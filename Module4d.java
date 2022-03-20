package Module4All;
import java.util.Scanner;
public class Module4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the month in number format. From 1-12 only: ");
		Scanner mont = new Scanner(System.in);
		int month = mont.nextInt();
				
		switch (month) {
		
		case 1:
			System.out.println("You entered Month " + month + ", January has 31 days.");
			break;
		case 2:
			System.out.println("You entered Month " + month + ", February has 28 or 29 days.");
			break;
		case 3:
			System.out.println("You entered Month " + month + ", March has 31 days.");
			break;
		case 4:
			System.out.println("You entered Month " + month + ", April has 30 days.");
			break;
		case 5:
			System.out.println("You entered Month " + month + ", May has 31 days.");
			break;
		case 6:
			System.out.println("You entered Month " + month + ", June has 30 days.");
			break;
		case 7:
			System.out.println("You entered Month " + month + ", July has 31 days.");
			break;
		case 8:
			System.out.println("You entered Month " + month + ", August has 31 days.");
			break;
		case 9:
			System.out.println("You entered Month " + month + ", September has 30 days.");
			break;
		case 10:
			System.out.println("You entered Month " + month + ", October has 31 days.");
			break;
		case 11:
			System.out.println("You entered Month " + month + ", November has 30 days.");
			break;
		case 12:
			System.out.println("You entered Month " + month + ", December has 31 days.");
			break;
		}
	}
}
