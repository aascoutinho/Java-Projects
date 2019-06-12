package course;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		
		
		System.out.println("How many bedrooms are thre in your house?");
		int broom = sc.nextInt();
		
		
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		
		
		System.out.println("Enter your last name, age and height (same line):");
		String lname = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.printf("%n%nName: %s%n%nBedrooms:%d%n%nProduct Price: $%.2f%n%nLast Name: %s%n%nAge: %d%n%nHeight: %.2f%n", name, broom, price, lname, age, height);
		
		sc.close();			

	}

}
