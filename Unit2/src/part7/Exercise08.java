package part7;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int aux;
		int cont = 0;
		int contFail = 0;
		// Ask number to user
		System.out.println("Introduce an inicial number: ");
		num = sc.nextInt();
		// Loop
		do {
			aux = num;
			// Ask number to user
			System.out.println("Introduce another number: ");
			num = sc.nextInt();
			cont++;
			if (num <= aux) {
				System.out.println("Fallo es menor");
				contFail++;
			}
		} while (num != 0);
		System.out.println("Total de números introducidos: " + cont);
		System.out.println("Números fallados: " + contFail);
		// Close scanner
		sc.close();
	}

}
