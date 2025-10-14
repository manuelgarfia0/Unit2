package diagrams;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int calificacion;
		// Ask data to user
		System.out.println("Introduce your grade: ");
		calificacion = sc.nextInt();
		// Check the grade
		if (calificacion >= 0 && calificacion < 3) {
			System.out.println("Muy deficiente");
		} else if (calificacion >= 3 && calificacion < 5) {
			System.out.println("Insuficiente");
		} else if (calificacion >= 5 && calificacion < 7) {
			System.out.println("Bien");
		} else if (calificacion >= 7 && calificacion < 9) {
			System.out.println("Notable");
		} else if (calificacion >= 9 && calificacion <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("La nota debe de estar entre 0 y 10");
		}
		// Close scanner
		sc.close();
	}

}
