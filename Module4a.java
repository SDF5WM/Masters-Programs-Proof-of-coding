package Module4All;

import java.util.Scanner;
public class Module4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner age = new Scanner(System.in);
		System.out.println("Enter Three People's Ages in years: ");
		int age1 = age.nextInt();
		int age2 = age.nextInt();
		int age3 = age.nextInt();
		//test for the oldest age
		if ((age1 > age2) && (age1 > age3)){
			System.out.println("The oldest age is: " + age1);	
		}
		else if((age1 < age2) && (age2 > age3)){
			System.out.println("The oldest age is: " + age2);
		}		
		else if((age1 < age3) && (age2 < age3)){
			System.out.println("The oldest age is: " + age3);
		}		
		// Test for youngest age
		if ((age1 < age2) && (age1 < age3)){
			System.out.println("The youngest age is: " + age1);	
		}
		else if((age1 > age2) && (age2 < age3)){
			System.out.println("The youngest age is: " + age2);
		}		
		else if((age1 > age3) && (age2 > age3)){
			System.out.println("The youngest age is: " + age3);
		}		
	}
}