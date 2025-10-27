package part4;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int count = 0;
		// Ask number to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Loop
		while (num >= 0) {
			// Add to count when the user introduce a number
			count++;
			// Ask another number to user
			System.out.println("Introduce another number: ");
			num = sc.nextInt();
		}
		// Show the count
		System.out.println("There are " + count + " numbers introduced");
		// Close scanner
		sc.close();

	}

}
