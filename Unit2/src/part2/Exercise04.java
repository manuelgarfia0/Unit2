package part2;

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
		tirada = sc.nextLine().toUpperCase();
		// Assign first try to an int variable
		num1 = switch (tirada) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Opción no valida");
			yield -1;
		}
		};
		// Ask user second try
		System.out.println("¿Cuánto has sacado en la segunda tirada?");
		tirada = sc.nextLine();
		// Assign SECOND try to an int variable
		num2 = switch (tirada) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Opción no valida");
			yield -1;
		}
		};
		// Show the result
		System.out.println(num1 + num2);
		// Close scanner
		sc.close();
	}

}
