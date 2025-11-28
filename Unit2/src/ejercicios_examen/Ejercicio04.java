package ejercicios_examen;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Crear el escaner
		Scanner sc = new Scanner(System.in);
		// Declarar las variables
		int lado;
		// Preguntar al usuario los lados del hexagono
		do {
			System.out.println("Introduce un número positivo: ");
			lado = sc.nextInt();
		} while (lado < 1);
		// Bucles para dibujar la parte superior del hexágono
		for (int i = 0; i < lado; i++) {
			for (int j = lado - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < lado + i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Bucles para dibujar la parte inferior del hexágono
		for (int i = 0; i < lado - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < lado * 2 + 2 - i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Cerrar escaner
		sc.close();

	}
}
