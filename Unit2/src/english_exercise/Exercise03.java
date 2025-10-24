package english_exercise;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final int MAX_HOUR = 12;
		final int MAX_MIN = 60;
		// Declare variables
		int hourReversed;
		int minuteReversed;
		int hour;
		int minute;
		// Ask the user the hour and minutes
		System.out.println("Introduce the hours and minutes");
		hourReversed = sc.nextInt();
		minuteReversed = sc.nextInt();
		// Check limits
		if (hourReversed > 12 || hourReversed < 1 && minuteReversed > 59 || minuteReversed < 0) {
			System.out.println("Hour or minute out of limits");
		}
		// Calculate minutes and hours
		if (minuteReversed == 0) {
			if (hourReversed == 12) {
				hour = 12;
				minute = 0;
			} else {
				minute = 0;
				hour = MAX_HOUR - hourReversed;
			}
		} else {
			if (hourReversed == 12) {
				hour = 11;
				minute = MAX_MIN - minuteReversed;
			} else {
				minute = MAX_MIN - minuteReversed;
				hour = (MAX_HOUR - 1) - hourReversed;
			}

		}
		// Show correct hour and minutes
		if (hour < 10) {
			System.out.print("0");
		}
		System.out.print(hour + " : ");
		if (minute < 10) {
			System.out.print("0");
		}
		System.out.print(minute);
		// Close scanner
		sc.close();

	}

}
