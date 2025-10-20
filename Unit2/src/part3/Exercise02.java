package part3;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		// Ask data to user
		System.out.println("Introduce a number (1-7): ");
		num = sc.nextInt();
		switch (num) {
		case 1 -> {
			System.out.println("Monday");
		}
		case 2 -> {
			System.out.println("Tuesday");
		}
		case 3 -> {
			System.out.println("Wednesday");
		}
		case 4 -> {
			System.out.println("Thursday");
		}
		case 5 -> {
			System.out.println("Friday");
		}
		case 6 -> {
			System.out.println("Saturday");
		}
		case 7 -> {
			System.out.println("Sunday");
		}
		default -> {
			System.out.println("The number must be between 1 and 7");
		}
		}
	}

}
