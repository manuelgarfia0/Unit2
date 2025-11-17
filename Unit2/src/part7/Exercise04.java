package part7;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num1;
		int num2;
		int mcm = 1;
		int max;
		int divisor;
		// Ask user the numbers
		System.out.println("Introduce both numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// Take the min number from num1 and num2
		max = Math.max(num1, num2);
		// Loop
		divisor = max;
		while (1 < divisor && mcm == 1) {
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				mcm = divisor;
			}
			divisor++;
		}
		System.out.println("The mcd is " + mcm);
		// Close scanner
		sc.close();
	}

}
