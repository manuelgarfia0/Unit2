package part7;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		boolean isPrime = false;
		int num;
		int divisor;
		int count = 0;

		// Ask user a number
		System.out.println("Introduce a number: ");
		num = sc.nextInt();

		// Check prime numbers
		for (int i = 2; i <= num; i++) {
			divisor = 2;
			isPrime = true;
			while (divisor < i && isPrime) {
				if (i % divisor == 0) {
					isPrime = false;
				}
				divisor++;
			}
			// If isPrime is true increment count
			if (isPrime) {
				count++;
			}
		}
		// Show count of prime numbers
		System.out.println("There are " + count + " prime numbers");
		// Close scanner
		sc.close();
	}

}
