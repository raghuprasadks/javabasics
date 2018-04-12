package workingjava;

import java.util.Scanner;

public class ScannerUserInput {
	public static void main(String[] args) {
		String rollNumber;
		String name;
		String standard;
		int totalmarks;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your roll number");
		rollNumber=	scan.next();
		
		
		System.out.println("Enter your name");
		name=scan.next();
		
		System.out.println("Enter your standard");
		standard=scan.next();
		
		System.out.println("Enter your marks");
		totalmarks=scan.nextInt();
		
		System.out.println("Thanks for entering your details " +name +" RollNumber " +rollNumber);
		

	}

}
