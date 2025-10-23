package english_exercise;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final int maxHour = 12;
		final int maxMin = 60;
		// Declare variables
		int hourReversed;
		int minuteReversed;
		int hour;
		int minute;
		// Ask the user the hour and minutes
		System.out.println("Introduce the hours and minutes");
		hourReversed = sc.nextInt();
		minuteReversed = sc.nextInt();
		// Check the limits
		if ((hourReversed < 1 || hourReversed > 12) && minuteReversed < 0 || minuteReversed > 59) {
			System.out.println("That hour doesn't exist.");
		} else {
			if (minuteReversed == 0) {
				minute = 0;
				hour = (hourReversed - maxHour) * -1;
				System.out.println(hour + " : " + minute);
			} else if (minuteReversed == 30) {
				minute = 0;
				hour = (hourReversed - maxHour) * -1;
				System.out.println(hour + " : " + minute);
			} else if (hourReversed > 5 && minuteReversed > 30) {
				hour = (hourReversed - maxHour) * -1;
				minute = (minuteReversed - maxMin) * -1;
				System.out.println(hour + " : " + minute);

			} else {
				hour = (hourReversed - maxHour + 1) * -1;
				minute = (minuteReversed - maxMin) * -1;
				System.out.println(hour + " : " + minute);
			}

		}
		// Close scanner
		sc.close();

	}

}
