package part6;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int numA;
		int numB;
		// Ask numbers to user
		System.out.println("Introduce a number: ");
		numA = sc.nextInt();
		System.out.println("Introduce another number: ");
		numB = sc.nextInt();
		// See the numbers between A and B
		// If numB is higher than numA show numbers from numA to numB
		if (numA < numB) {
			for (int i = numA; i <= numB; i++) {
				System.out.println(i);
			}
			// If numA is higher than numB show numbers from numB to numA
		} else {
			for (int i = numA; i >= numB; i--) {
				System.out.println(i);
			}
		}
		// Close scanner
		sc.close();
	}

}
