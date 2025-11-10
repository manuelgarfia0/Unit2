package part6;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable
		int num;
		boolean prime = true;
		// Ask number to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// If the number
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		System.out.println(prime);
	}

}
