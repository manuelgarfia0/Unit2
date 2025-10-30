package part4;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		double addNeg = 0;
		int add = 0;
		int countZero = 0;
		int countNeg = 0;
		int count = 0;
		double meanNeg;
		// Ask number to user
		System.out.println("Introduce 10 numbers: ");
		num = sc.nextInt();
		// Loop
		while (count < 9) {
			// We count how many numbers the user introduce
			count++;
			// If the number is negative we need the mean
			if (num < 0) {
				countNeg++;
				addNeg += num;
			}
			// If the number is zero we count how many zeros are
			if (num == 0) {
				countZero++;
			}
			// If the number is positive we need the addition
			if (num > 0) {
				add += num;
			}
			// Ask another number
			System.out.println("Introduce another number: ");
			num = sc.nextInt();
		}
		// Calculate the mean of the negative numbers
		meanNeg = addNeg / countNeg;
		// Show results
		System.out.println("The addition of positive numbers is: " + add);
		System.out.println("The mean of the negative numbers is: " + meanNeg);
		System.out.println("There are " + countZero + " zeros");
		// Close scanner
		sc.close();
	}

}
