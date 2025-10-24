package english_exercise;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final double BASIC_SYSTEM = 375.99;
		final double SCREEN_38 = 75.99;
		final double SCREEN_43 = 99.99;
		final double ANTIVIRUS = 65.99;
		final double PRINTER = 125.00;
		// Declare variables
		int screen;
		int extras;
		int finalPrice = 0;
		// Ask for screen
		System.out.println("Which screen do you want?");
		System.out.println("1. 38 cm screen: " + SCREEN_38);
		System.out.println("2. 43 cm screen: " + SCREEN_43);
		screen = sc.nextInt();
		// Check the screen
		if (screen == 1) {
			finalPrice += SCREEN_38;
		} else if (screen == 2) {
			finalPrice += SCREEN_43;
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
		switch (extras) {
		case 1 -> {
			finalPrice += ANTIVIRUS;
		}
		case 2 -> {
			finalPrice += PRINTER;
		}
		case 3 -> {
			finalPrice += ANTIVIRUS + PRINTER;
		}
		default -> {
			System.out.println("Not an option");
		}
		}
		// Add basic system to the final price
		finalPrice += BASIC_SYSTEM;
		// Show price to user
		System.out.println("The final price is " + finalPrice);
		// Close scanner
		sc.close();
	}

}
