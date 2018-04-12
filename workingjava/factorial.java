package workingjava;

import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		int number; 
		int factorial = 1;
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter a number to get factorial");
		number = scan.nextInt();		
		for (int counter=1;counter <=number;counter++)
		{
			factorial = factorial*counter;
		}		
		System.out.println("Factorial of the number is " +factorial);
	}
}
