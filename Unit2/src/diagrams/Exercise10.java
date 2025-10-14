package diagrams;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int hours;
		int min;
		int sec;
		// Ask data to user
		System.out.println("Introduce an amount of hours: ");
		hours = sc.nextInt();
		System.out.println("Introduce an amount of minutes: ");
		min = sc.nextInt();
		System.out.println("Introduce an amount of seconds: ");
		sec = sc.nextInt();
		// Check the time to add minutes or hours depending on the amount introduced
		if (sec < 59) {
			sec++;
		} else {
			sec = 0;
			if (min < 59) {
				min++;
			} else {
				min = 0;
				if (hours < 23) {
					hours++;
				} else {
					hours = 0;
				}
			}
		}
		// Print time
		System.out.println(hours + " : " + min + " : " + sec);
		// Close scanner
		sc.close();

	}
}
