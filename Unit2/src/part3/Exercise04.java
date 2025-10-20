package part3;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		String tirada;
		int num1 = 0;
		int num2 = 0;
		// Ask user first try
		System.out.println("¿Cuánto has sacado en la primera tirada?");
		tirada = sc.nextLine();
		// Assign first try to an int variable
		switch (tirada) {
		case "UNO" -> {
			num1 = 1;
		}
		case "DOS" -> {
			num1 = 2;
		}
		case "TRES" -> {
			num1 = 3;
		}
		case "CUATRO" -> {
			num1 = 4;
		}
		case "CINCO" -> {
			num1 = 5;
		}
		case "SEIS" -> {
			num1 = 6;
		}
		default -> {
			System.out.println("Opción no valida");
		}
		}
		// Ask user second try
		System.out.println("¿Cuánto has sacado en la segunda tirada?");
		tirada = sc.nextLine();
		// Assign SECOND try to an int variable
		switch (tirada) {
		case "UNO" -> {
			num2 = 1;
		}
		case "DOS" -> {
			num2 = 2;
		}
		case "TRES" -> {
			num2 = 3;
		}
		case "CUATRO" -> {
			num2 = 4;
		}
		case "CINCO" -> {
			num2 = 5;
		}
		case "SEIS" -> {
			num2 = 6;
		}
		default -> {
			System.out.println("Opción no valida");
		}
		}
		// Show the result
		System.out.println(num1 + num2);
		// Close scanner
		sc.close();
	}

}
