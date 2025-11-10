package part6;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		double mean = 0;
		// Ask numbers and add to the variable mean
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce a number: ");
			num = sc.nextInt();
			mean += num;
		}
		// Divide the mean by 10
		mean = mean / 10;
		// Show the mean
		System.out.println("The mean is " + mean);
		// Close scanner
		sc.close();

	}

}
