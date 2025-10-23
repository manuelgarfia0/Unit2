package english_exercise;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final double basicSystem = 375.99;
		final double screen38 = 75.99;
		final double screen43 = 99.99;
		final double antivirus = 65.99;
		final double printer = 125.00;
		// Declare variables
		int screen;
		int extras;
		int finalPrice = 0;
		// Ask for screen
		System.out.println("Which screen do you want? (38cm or 43cm)");
		screen = sc.nextInt();
		// Check the screen
		if (screen == 38) {
			finalPrice += screen38;
		} else if (screen == 43) {
			finalPrice += screen43;
		} else {
			System.out.println("Not a screen");
		}
		// Ask for extras
		System.out.println("Do you want some extras?");
		System.out.println("1. Antivirus");
		System.out.println("2. Printer");
		System.out.println("3. Both");
		extras = sc.nextInt();
		// Check extras
		if (extras == 1) {
			finalPrice += antivirus;
		} else if (extras == 2) {
			finalPrice += printer;
		} else if (extras == 3) {
			finalPrice += antivirus + printer;
		} else {
			System.out.println("Not an option");
		}
		// Add basic system to the final price
		finalPrice += basicSystem;
		// Show price to user
		System.out.println("The final price is " + finalPrice);
		// Close scanner
		sc.close();
	}

}
