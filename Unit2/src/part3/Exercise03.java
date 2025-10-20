package part3;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int option;
		int num1;
		int num2;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num1 = sc.nextInt();

		System.out.println("Introduce another number: ");
		num2 = sc.nextInt();
		// Show options to user
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		option = sc.nextInt();

		// Create menu
		switch (option) {
		case 1 -> {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		case 2 -> {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		case 3 -> {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		case 4 -> {
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
