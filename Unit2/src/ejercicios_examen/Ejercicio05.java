package ejercicios_examen;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear escaner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int num;
		// Preguntar al usuario tamaño del escaque
		System.out.println("Introduce el tamaño del escaque: ");
		num = sc.nextInt();
		// Bucle para las filas del tablero
		for (int i = 0; i < 4; i++) {
			// Bucle para los escaques
			for (int j = 0; j < num; j++) {
				for (int k = 0; k < num; k++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
