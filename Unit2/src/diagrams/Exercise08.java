package diagrams;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num1;
		int num2;
		int num3;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num1 = sc.nextInt();
		System.out.println("Introduce another number: ");
		num2 = sc.nextInt();
		System.out.println("Introduce another number: ");
		num3 = sc.nextInt();
		// Check which number is the higher
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the higher number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the higher number");
		} else {
			System.out.println(num3 + " is the higher number");
		}
		// Close scanner
		sc.close();
	}

}
