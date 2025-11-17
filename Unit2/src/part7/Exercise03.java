package part7;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num1;
		int num2;
		int mcd = 1;
		int min;
		int divisor;
		// Ask user the numbers
		System.out.println("Introduce both numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// Take the min number from num1 and num2
		min = Math.min(num1, num2);
		// Loop
		divisor = min;
		while (divisor > 1 && mcd == 1) {
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				mcd = divisor;
			}
			divisor--;
		}
		System.out.println("The mcd is " + mcd);
		// Close scanner
		sc.close();
	}

}
