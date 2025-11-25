package ejercicios_examen;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear escaner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int num;
		int contPar = 0;
		int contImpar = 0;
		int i = 0;
		// Preguntar un número al usuario
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		// Bucle para recorrer el número, mientras que el número siga teniendo dígitos
		// por recorrer seguirá copntando
		while (num > 0) {
			// Asigno a i el primer dígito del número
			i = num % 10;
			// Si el número es par añadimos al contador
			if (i % 2 == 0) {
				contPar++;
				// Si es impar añadimos al contador
			} else {
				contImpar++;
			}
			// Le quitamos el primer dígito al número
			num /= 10;
		}
		// Mostramos el resultado
		System.out.println("El número tiene " + contPar + " números pares y " + contImpar + " impares");
		// Cerrar escaner
		sc.close();

	}

}
