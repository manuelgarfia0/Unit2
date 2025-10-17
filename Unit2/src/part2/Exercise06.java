package part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num1;
		int num2;
		int num3;
		// Ask data to user
		System.out.println("Introduce 3 numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		// Check if the addition of two of the numbers, the answer is the other number
		if (num1 + num2 == num3) {
			System.out.println("The addition of " + num1 + " + " + num2 + " = " + num3);
		} else if (num1 + num3 == num2) {
			System.out.println("The addition of " + num1 + " + " + num3 + " = " + num2);
		} else if (num2 + num3 == num1) {
			System.out.println("The addition of " + num2 + " + " + num3 + " = " + num1);
		} else {
			System.out.println("The addition of two numbers, the answer isn't the other number.");
		}
		// Close scanner
		sc.close();
	}

}
