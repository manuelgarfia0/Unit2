package part7;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int reverse = 0;
		int aux;
		int digit;
		// If the number introduced by the user is lower than 0 keep asking
		do {
			// Ask number to user
			System.out.println("Introduce a number: ");
			num = sc.nextInt();
		} while (num < 0);
		// Save the number in an auxiliar variable
		aux = num;
		// Loop to check if the number is capicua
		while (aux != 0) {
			// Take the last digit
			digit = aux % 10;
			// Add the digit to the new number
			reverse = reverse * 10 + digit;
			// Delete the digit taken from the number to take the next one
			aux /= 10;
		}

		if (num == reverse) {
			System.out.println("Is capicua");
		} else {
			System.out.println("Isn't capicua");
		}
	}

}
