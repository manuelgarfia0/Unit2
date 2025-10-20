package part3;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int grade;
		// Ask data to user
		System.out.println("Introduce your grade: ");
		grade = sc.nextInt();
		// Check the grade
		switch (grade) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("Insuficiente");
		}
		case 5 -> {
			System.out.println("Suficiente");
		}
		case 6 -> {
			System.out.println("Bien");
		}
		case 7, 8 -> {
			System.out.println("Notable");
		}
		case 9, 10 -> {
			System.out.println("Sobresaliente");
		}
		default -> {
			System.out.println("You can't get this grade. The number must be between 0 and 10");
		}
		}
	}

}
