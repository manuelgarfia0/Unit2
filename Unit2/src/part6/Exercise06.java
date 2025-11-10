package part6;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable
		int grade;
		int count = 0;
		// Ask for 5 grades
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce a grade: ");
			grade = sc.nextInt();
			// If the grade is less than 5 increment count
			if (grade < 5) {
				System.out.println(count++);
			}
		}
		// Show result
		System.out.println("There are " + count + "students who failed");
		// Close scanner
		sc.close();
	}

}
