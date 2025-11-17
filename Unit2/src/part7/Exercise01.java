package part7;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int hour;
		int min;
		int sec;
		int secInc;
		// Ask user hours, minutes and seconds
		System.out.println("Introduce an hour, minutes and seconds: ");
		hour = sc.nextInt();
		min = sc.nextInt();
		sec = sc.nextInt();
		if ((hour < 23 && hour > 0) && (min < 59 && min >= 0) && (sec < 59 && sec >= 0)) {
			// Ask how many seconds do the user want to increment
			System.out.println("How many seconds do you want to increment?");
			secInc = sc.nextInt();
			// Increment seconds
			for (int i = 1; i <= secInc; i++) {
				sec++;
				if (sec == 60) {
					sec = 0;
					min++;
					if (min == 60) {
						min = 0;
						hour++;
						if (hour == 24) {
							hour = 0;
						}
					}
				}

			}
			// Print correctly
			if (hour < 10) {
				System.out.print("0");
			}
			System.out.print(hour + ":");
			if (min < 10) {
				System.out.print("0");
			}
			System.out.print(min + ":");
			if (sec < 10) {
				System.out.print("0");
			}
			System.out.println(sec);
		} else {
			System.out.println("Invalid input");
		}
		// Close scanner
		sc.close();

	}

}
