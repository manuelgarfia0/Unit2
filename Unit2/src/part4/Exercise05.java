package part4;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int age;
		int add = 0;
		int count = 0;
		int ageOver = 0;
		double mean;
		// Ask age to user
		System.out.println("Introduce the age of a student: ");
		age = sc.nextInt();
		// Loop
		while (age >= 0) {
			count++;
			if (age >= 18) {
				ageOver++;
			}
			add += age;
			// Ask another age to user
			System.out.println("Introduce another student: ");
			age = sc.nextInt();
		}
		// Calculate mean
		mean = (double) add / count;
		// Show results
		System.out.println("The mean of age is: " + mean);
		System.out.println("The addition of all ages is " + add);
		System.out.println("The number of students is " + count);
		System.out.println("The number of students over 18 is " + ageOver);
		// Close scanner
		sc.close();
	}

}
