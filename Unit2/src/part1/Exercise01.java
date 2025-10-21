package part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Indicate if the number is odd or even
		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
		// Close scanner
		sc.close();
	}

}
