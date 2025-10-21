package part3;

import java.util.Scanner;

/*
 * Positive number
 * Input: 5
 * Output: 5
 * 
 * Zero
 * Input: 0
 * Output: 0
 * 
 * Negative number
 * Input: -5
 * Output: 5
 */
public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask a number to user
		System.out.println("Introduce a number");
		num = sc.nextInt();
		// Check absolute value
		System.out.println(num >= 0 ? "The absolute value is " + num : "The absolute value is " + num * -1);
	}

}
