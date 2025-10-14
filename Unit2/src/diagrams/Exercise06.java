package diagrams;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num1;
		int num2;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num1 = sc.nextInt();
		System.out.println("Introduce another number: ");
		num2 = sc.nextInt();
		// Check which number is higher
		if (num1 < num2) {
			System.out.println(num1 + " - " + num2);
		} else {
			System.out.println(num2 + " - " + num1);
		}
		// Close scanner
		sc.close();
	}

}
