package part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		String option;
		double num1;
		double num2;
		double res = 0;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num1 = sc.nextInt();

		System.out.println("Introduce another number: ");
		num2 = sc.nextInt();
		// Show options to user
		System.out.println("A. Addition");
		System.out.println("B. Subtraction");
		System.out.println("C. Multiplication");
		System.out.println("D. Division");
		System.out.println("Introduce an option: ");
		option = sc.nextLine().toUpperCase();

		// Create menu
		switch (option) {
		case "A" -> {
			res = num1 + num2;
		}
		case "B" -> {
			res = num1 - num2;
		}
		case "C" -> {
			res = num1 * num2;
		}
		case "D" -> {
			// Control division by 0
			if (num1 == 0) {
				System.out.println("You can't divide by 0");
			} else {
				res = num1 / num2;
				;
			}
		}
		default -> {
			System.out.println("Invalid option");
		}
		}
		System.out.println(res);
		// Close scanner
		sc.close();
	}

}
