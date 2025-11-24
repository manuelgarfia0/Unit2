package part7;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask number to user
		System.out.println("Introduce a number between 1-20: ");
		num = sc.nextInt();
		if (num > 0 && num < 20) {
			for (int i = 1; i <= num; i++) {
				// Repetir el número i tantas veces como su valor
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid input");
		}
		// Close scanner
		sc.close();

	}

}
