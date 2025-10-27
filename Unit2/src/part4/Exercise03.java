package part4;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double num;
		int count = 0;
		double add = 0;
		double mean;
		// Ask number to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Loop
		while (num >= 0) {
			// Add to count when the user introduce a number
			count++;
			add += num;
			// Ask another number to user
			System.out.println("Introduce another number: ");
			num = sc.nextInt();
		}
		// Calculate the mean
		mean = add / count;
		// Show the count
		System.out.println("The mean of the numbers is " + mean);
		// Close scanner
		sc.close();

	}

}
