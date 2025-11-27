package ejercicios_examen;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Crear el escaner
		Scanner sc = new Scanner(System.in);
		// Declarar las variables
		int num;
		// Ask a positive number to the user
		do {
			System.out.println("Introduce un número positivo: ");
			num = sc.nextInt();
		} while (num < 1);
		// Bucles para dibujar la parte superior del hexágono
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < num + i; k++) {
				System.out.print("*");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Bucles para dibujar la parte inferior del hexágono
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < num + (num - 2 - i); k++) {
				System.out.print("*");
			}
			for (int l = 0; l < (num - 2 - i); l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Cerrar escaner
		sc.close();
	}
}
