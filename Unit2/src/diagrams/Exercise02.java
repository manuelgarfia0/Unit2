package diagrams;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int age;
		// Ask data to user
		System.out.println("Introduce your age: ");
		age = sc.nextInt();
		// If age is higher or equal than 18 print a message
		if (age >= 18) {
			System.out.println("You are of legal age");
			// If not print another message
		} else {
			System.out.println("You aren´t of legal age");
		}
		// Close scanner
		sc.close();
	}

}
