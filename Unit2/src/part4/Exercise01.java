package part4;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int add = 0;
		// Ask a number to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Loop
		while (num >= 0) {
			add += num;
			// Ask for another number
			System.out.println("Introduce another number: ");
			num = sc.nextInt();
		}
		// Show addition
		System.out.println("The addition is: " + add);
		// Close scanner
		sc.close();
	}

}
