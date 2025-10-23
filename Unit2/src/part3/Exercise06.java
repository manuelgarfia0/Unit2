package part3;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int days;
		int month;
		int year;
		// Ask data to user
		System.out.println("Introduce a year: ");
		year = sc.nextInt();
		System.out.println("Introduce a month (1 - 12): ");
		month = sc.nextInt();
		// Check if the user introduce a correct month
		if (month > 0 && month < 13) {
			// Check if the year is leap
			days = switch (month) {
			case 4, 6, 9, 11 -> {
				yield 30;
			}
			// Check if the year is leap or not
			case 2 -> {
				if (year % 4 == 0) {
					yield 29;
				} else {
					yield 28;
				}
			}
			default -> {
				yield 31;
			}
			};

			// Show info to user
			System.out.println("The month " + month + " have " + days + " days");

		} else {
			System.out.println("That month doesn't exist.");
		}
		// Close scanner
		sc.close();

	}

}
