package ejercicios_examen;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear escaner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int num;
		// Preguntar al usuario un número para la construcción del cuadrado
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		// Bucle para imprimir las filas que tendrá el cuadrado (eje y)
		for (int i = 1; i <= num; i++) {
			// Bucle para imprimir las columnas (eje x)
			for (int j = 1; j <= num; j++) {
				// Si i o j son iguales a 1 o al número que ha introducido el usuario imprime un
				// asterisco si no un espacio en blanco
				if (i == 1 || i == num || j == 1 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// Cerrar escaner
		sc.close();

	}

}
