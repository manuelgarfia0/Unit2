package ejercicios_examen;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear escaner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int num;
		boolean blanco;
		// Preguntar al usuario tamaño del escaque
		System.out.println("Introduce el tamaño del escaque: ");
		num = sc.nextInt();
		// Bucle para las filas del tablero
		for (int i = 0; i < 8; i++) {
			// Bucle para las filas de los escaques
			for (int k = 0; k < num; k++) {
				// Bucle para las columnas del tablero
				for (int j = 0; j < 8; j++) {
					blanco = (i + j) % 2 == 0;
					// Si es blanco, imprimir espacios
					// Si es negro, imprimir '#'
					for (int tamaño = 0; tamaño < num; tamaño++) {
						if (blanco) {
							System.out.print(" ");
						} else {
							System.out.print("#");
						}
					}
				}
				System.out.println();
			}
		}
	}

}
