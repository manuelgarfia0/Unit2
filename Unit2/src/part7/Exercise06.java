package part7;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask user a number
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int k = num - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Close scanner
		sc.close();
	}
}