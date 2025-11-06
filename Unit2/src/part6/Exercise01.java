package part6;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask number to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Count 1 to num
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		// Close scanner
		sc.close();

	}

}
