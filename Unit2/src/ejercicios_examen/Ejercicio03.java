package ejercicios_examen;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Crear escaner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int num;
		// Preguntar número al usuario
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		// Bucle para imprimir las filas (eje y)
		for (int i = 0; i < num; i++) {
			// Imprimir espacios a la izquierda del triángulo
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			// Imprimir los bordes del triángulo solamente
			for (int j = i; j < num; j++) {
				if (i == 0 || j == i || j == num - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println("");
		}
		// Cerrar escaner
		sc.close();

	}

}
