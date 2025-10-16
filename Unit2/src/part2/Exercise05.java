package part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int election1;
		int election2;
		// Ask data to user
		System.out.println("Player 1. Introduce 1 (paper), 2 (scissors), 3 (rock): ");
		election1 = sc.nextInt();
		System.out.println("Player 2. Introduce 1 (paper), 2 (scissors), 3 (rock): ");
		election2 = sc.nextInt();
		// Check results
		if ((election1 == 1 && election2 == 2) || (election1 == 2 && election2 == 3)
				|| (election1 == 3 && election2 == 1)) {
			System.out.println("Player 2 wins!");
		} else if ((election2 == 1 && election1 == 2) || (election2 == 2 && election1 == 3)
				|| (election2 == 3 && election1 == 1)) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Draw");
		}
		// Close scanner
		sc.close();
	}

}
