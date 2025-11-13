package part6;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int numA;
		int numB;
		int lower;
		int higher;
		// Ask numbers to user
		System.out.println("Introduce a number: ");
		numA = sc.nextInt();
		System.out.println("Introduce another number: ");
		numB = sc.nextInt();
		// Initialize the variable to the lower number
		lower = Math.min(numA, numB);
		// Initialize the variable to the higher number
		higher = Math.max(numA, numB);
		// Show numbers from lower number to higher
		for (int i = lower; i <= higher; i++) {
			System.out.println(i);
		}
		// Close scanner
		sc.close();
	}

}
