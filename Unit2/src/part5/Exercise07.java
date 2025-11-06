package part5;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		String option;
		double num1;
		double num2;
		double res = 0;
		// While the option isn't "E" (exit), continue asking
		do {
			// Ask data to user
			System.out.println("Introduce a number: ");
			num1 = sc.nextInt();

			System.out.println("Introduce another number: ");
			num2 = sc.nextInt();
			// Clean buffer
			sc.nextLine();
			// Show options to user
			System.out.println("A. Addition");
			System.out.println("B. Subtraction");
			System.out.println("C. Multiplication");
			System.out.println("D. Division");
			System.out.println("E. Exit");
			System.out.println("Introduce an option: ");
			option = sc.nextLine().toUpperCase();

			// Create menu
			switch (option) {
			case "A" -> {
				res = num1 + num2;
				System.out.println(res);
			}
			case "B" -> {
				res = num1 - num2;
				System.out.println(res);
			}
			case "C" -> {
				res = num1 * num2;
				System.out.println(res);
			}
			case "D" -> {
				// Control division by 0
				if (num1 == 0) {
					System.out.println("You can't divide by 0");
				} else {
					res = num1 / num2;
					System.out.println(res);
				}
			}
			case "E" -> {
				System.out.println("...");
			}
			default -> {
				System.out.println("Invalid option");
			}
			}
		} while (!option.equals("E"));
		// Close scanner
		sc.close();

	}

}
