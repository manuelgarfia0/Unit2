package part1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double x1;
		double x2;
		int a;
		int b;
		int c;
		double discriminating;
		// Ask data to user
		System.out.println("Introduce the value of the coeficients (a, b, c): ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// Give value to the discriminating
		discriminating = Math.pow(b, 2) - 4 * a * c;
		// Check if the ecuation exist
		if (discriminating >= 0) {
			// Calculate the second grade ecuation
			x1 = (-b + Math.sqrt(discriminating)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminating)) / (2 * a);
			// Show answers
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("The ecuation has one answer. x = " + x1);
		} else {
			System.out.println("The answer is not real");
		}
		// Close scanner
		sc.close();
	}

}
