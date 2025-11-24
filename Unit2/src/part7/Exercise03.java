package part7;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);

		// Declarar variables
		int num1;
		int num2;
		int mcd = 1;
		int min;
		int divisor;

		// Pedir los números al usuario
		System.out.println("Introduce both numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Tomar el menor de num1 y num2
		min = Math.min(num1, num2);

		// Inicializar divisor
		divisor = min;

		// Bucle para buscar el MCD
		while (divisor >= 1 && mcd == 1) {
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				mcd = divisor;
			} else {
				divisor--;
			}
		}

		// Mostrar el resultado
		System.out.println("The mcd is " + mcd);

		// Cerrar scanner
		sc.close();
	}
}
