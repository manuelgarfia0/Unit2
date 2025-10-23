package english_exercise;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final double interestAC = 1.5;
		final double interestB = 2;
		final double interestX = 5;
		// Declare variables
		double money;
		String bank;
		// Ask data to user
		System.out.println("Which type of bank do you want?");
		System.out.println("A--> 1.5");
		System.out.println("B--> 2");
		System.out.println("C--> 1.5");
		System.out.println("X--> 5");
		bank = sc.nextLine().toUpperCase();

		System.out.println("Introduce the amount of money you wanna save: ");
		money = sc.nextInt();
		// Check money with the type of bank
		switch (bank) {
		case "A", "C" -> {
			money = money * interestAC;
		}
		case "B" -> {
			money = money * interestB;
		}
		case "X" -> {
			money = money * interestX;
		}
		default -> {
			System.out.println("Not a type of bank");
		}
		}
		// Show the money after a year
		System.out.println(money);
		// Close scanner
		sc.close();

	}

}
