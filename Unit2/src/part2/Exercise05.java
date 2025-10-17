package part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final String rock = "rock";
		final String scissors = "scissors";
		final String paper = "paper";
		// Declare variables
		String election1;
		String election2;
		// Ask data to user
		System.out.println("Player 1. Introduce paper, rock or scissors: ");
		election1 = sc.nextLine();
		System.out.println("Player 2. Introduce paper, rock or scissors: ");
		election2 = sc.nextLine();
		// Check results
		if (!election1.equalsIgnoreCase(paper) && !election1.equalsIgnoreCase(scissors)
				&& !election1.equalsIgnoreCase(rock) && election2.equalsIgnoreCase(paper)
				&& election2.equalsIgnoreCase(scissors) && election2.equalsIgnoreCase(rock)) {
			System.out.println("Answer not allowed");
		} else if ((election1.equalsIgnoreCase(paper) && election2.equalsIgnoreCase(scissors))
				|| (election1.equalsIgnoreCase(scissors) && election2.equalsIgnoreCase(rock))
				|| (election1.equalsIgnoreCase(rock) && election2.equalsIgnoreCase(paper))) {
			System.out.println("Player 2 wins!");
		} else if (election1.equalsIgnoreCase(election2)) {
			System.out.println("Draw!");
		} else {
			System.out.println("Player 1 wins!");
		}
		// Close scanner
		sc.close();
	}

}
