package part3;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		String option;
		int num1;
		int num2;
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
		option = sc.nextLine();

		// Create menu
		switch (option) {
		case "A" -> {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		case "B" -> {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		case "C" -> {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		case "D" -> {
			// Control division to 0
			if (num1 == 0) {
				System.out.println("You can't divide to 0");
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
		}
		default -> {
			System.out.println("Invalid option");
		}
		}
	}

}
