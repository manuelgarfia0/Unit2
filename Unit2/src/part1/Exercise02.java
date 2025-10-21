package part1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double num;
		// Ask data to user
		System.out.println("Introduce a decimal number: ");
		num = sc.nextDouble();
		// Check if is between -1 and 1, without counting -1, 1 and 0
		if (num < 1 && num != 0 && num > -1) {
			System.out.println(num + " is almost zero.");
		} else {
			System.out.println("The number isn't almost zero.");
		}
		// Close scanner
		sc.close();
	}

}
