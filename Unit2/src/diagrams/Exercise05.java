package diagrams;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Check if number is postive
		if (num >= 0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is negative");
		}
		// Close scanner
		sc.close();
	}

}
