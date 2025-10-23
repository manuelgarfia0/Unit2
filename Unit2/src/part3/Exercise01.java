package part3;

import java.util.Scanner;

/*
 * if number is out of range
 * Input: 10000
 * Output: Invalid number
 * Input: -1
 * Output: Invalid number
 * 
 * if number have one digit
 * Input: 1
 * Output: The number is capicua
 * 
 * if number have two digits
 * Input: 22
 * Output: The number is capicua
 * Input: 21
 * Output: The number isn't capicua
 * 
 * if number have three digits
 * Input: 232
 * Output: The number is capicua
 * Input: 223
 * Output: The number isn't capicua
 * 
 * if number have four digits
 * Input: 2332
 * Output: The number is capicua
 * Input: 2122
 * Output: The number isn't capicua
 */
public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask a number to the user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Check if the number is capicua
		if (num >= 0 && num <= 9999) {
			System.out.println("Invalid number");
		} else if (num < 10) {
			System.out.println("The number is capicua");
		} else if (num < 100 && num / 10 == num % 10) {
			System.out.println("The number is capicua");
		} else if (num < 1000 && num / 100 == num % 10) {
			System.out.println("The number is capicua");
		} else if (num < 10000 && num / 1000 == num % 10 && (num / 100) % 10 == (num / 10) % 10) {
			System.out.println("The number is capicua");
		} else {
			System.out.println("The number isn't capicua");
		}
		// Close scanner
		sc.close();
	}

}
