package part6;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int factorial = 1;
		// Ask number to the user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Multiply the number introduced to factorial, decrement the number and
		// multiply until the number is 1
		for (int i = num; i >= 1; i--) {
			System.out.print(num);
			if (i != 1) {
				System.out.print(" * ");
			}
			factorial *= num;
			num--;
		}
		// Show the result
		System.out.print(" = " + factorial);
		// Close scanner
		sc.close();
	}

}
