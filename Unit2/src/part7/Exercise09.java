package part7;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int count = 0;
		// Ask user a number
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Loop to count how many digits does the number has
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println("The numbers has " + count + " digits");
		// Close scanner
		sc.close();
	}

}
