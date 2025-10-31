package part5;

import java.util.Random;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner and random
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// Declare variables
		int randNum;
		int min = 1;
		int max = 101;
		String instruction;
		// Ask number to user
		System.out.println("Think a number (1 - 100): ");
		// Try to guess the number
		do {
			// Generate a random number between the 1 and 100
			randNum = rd.nextInt(min + 1, max);
			// Show randNum
			System.out.println(randNum);
			// Ask user if the number is higher or lower
			System.out.println("Is higher, lower or equal?");
			instruction = sc.next();
			// If randNum is higher the min number will change to the randNum
			if (instruction.equalsIgnoreCase("higher")) {
				min = randNum;
				// If randNum is lower the max number will change to the randNum
			} else if (instruction.equalsIgnoreCase("lower")) {
				max = randNum;
				// If randNum is equal the computer will win
			} else if (instruction.equalsIgnoreCase("equal")) {
				System.out.println("I WIN!");
				// If the user introduce a different answer, say to the user
			} else {
				System.out.println("That's not an answer");
			}
		} while (!instruction.equalsIgnoreCase("equal"));
		// Close scanner
		sc.close();

	}

}
