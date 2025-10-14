package diagrams;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num1;
		int num2;
		int addition;
		int subtraction;
		int multiplication;
		double division;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num1 = sc.nextInt();
		System.out.println("Introduce another number: ");
		num2 = sc.nextInt();
		// Do and show operations
		addition = num1 + num2;
		System.out.println(addition);
		subtraction = num1 - num2;
		System.out.println(subtraction);
		multiplication = num1 * num2;
		System.out.println(multiplication);
		// If num2 = 0 you can't do the division
		if (num2 == 0) {
			System.out.println("You can't divide by 0");
		} else {
			division = num1 / num2;
			System.out.println(division);
		}
		// Close scanner
		sc.close();

	}

}
