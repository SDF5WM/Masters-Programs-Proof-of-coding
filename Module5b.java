package Module5All;

import java.util.Scanner;
public class Module5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word: ");
		Scanner wor = new Scanner(System.in);
		String word = wor.next();
				
		for (int i = 0; i <= (word.length()-1); i ++){
			System.out.println(word.charAt(i));
		}
	}

}
