package Module5All;
import java.util.Scanner;
public class Module5c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer for the nth fibonacci number value: ");
		Scanner num = new Scanner(System.in);
		int numb = num.nextInt();	
		int fold1 = 0;
		int fold2 = 1;
		int fnew = 0;
		int i;
				
		for ( i = 0; i < numb; i ++){
			fnew = fold1 + fold2;
			fold2 = fold1;
			fold1 = fnew;		
		}
		System.out.println("The " + i + "th Fibonacci value is: " + fnew);	
	}
}
