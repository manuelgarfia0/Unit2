package part1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask data to user
		System.out.println("Introduce a number between 0 - 9999: ");
		num = sc.nextInt();
		// Check how many digits have the number
		if (num < 0 || num > 99999) {
			System.out.println("Number out of range");
		} else if (num < 10) {
			System.out.println("The number has 1 digit");
		} else if (num < 100) {
			System.out.println("The number has 2 digits");
		} else if (num < 1000) {
			System.out.println("The number has 3 digits");
		} else {
			System.out.println("The number has 4 digits");
		}
		// Close scanner
		sc.close();
	}

}
