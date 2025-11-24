package part7;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask user a number for the pyramid
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Loop to build the pyramid
		for (int i = 1; i <= num; i++) {
			// Loop to print ascendant numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// Loop to print descendant numbers
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
