package examen;

import java.util.Random;
import java.util.Scanner;

public class SieteYMedia {

	public static void main(String[] args) {

		// Crear el scanner y el Random
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// Declaramos las variables
		String turno;
		double jugador1 = 0;
		double jugador2 = 0;
		int numeroRand;
		int paloRand;
		String palo = "";
		String cartaMedia = "";

		// Señalamos de que jugador es el turno
		System.out.println("Es el turno del jugador 1");

		// Bucle para el turno del jugador 1
		do {
			// Preguntamos al jugador si quiere sacar una carta
			System.out.println("¿Quieres sacar una carta?");
			turno = sc.nextLine();
			// Vuelvo a poner otro numero aleatorio y otro palo aleatorio
			numeroRand = rd.nextInt(1, 11);
			paloRand = rd.nextInt(1, 5);
			// Asignamos el palo
			palo = switch (paloRand) {
			case 1 -> {
				yield "oros";
			}
			case 2 -> {
				yield "copas";
			}
			case 3 -> {
				yield "espadas";
			}
			default -> {
				yield "bastos";
			}
			};
			cartaMedia = switch (numeroRand) {
			case 8 -> {
				yield "sota";
			}
			case 9 -> {
				yield "caballo";
			}
			default -> {
				yield "rey";
			}
			};

			if (turno.equalsIgnoreCase("S") || turno.equalsIgnoreCase("N")) {
				if (numeroRand > 0 && numeroRand < 8) {
					System.out.println("Tu carta es: " + numeroRand + " de " + palo);
					jugador1 += numeroRand;
					System.out.println("Tienes " + jugador1 + " puntos");
				} else {
					System.out.println("Tu carta es: " + cartaMedia + " de " + palo);
					jugador1 += 0.5;
					System.out.println("Tienes " + jugador1 + " puntos");
				}
				if (jugador1 > 7.5) {
					System.out.println("Te has pasado, has perdido");
					jugador1 = 0;
					turno = "N";
				}
			} else {
				System.out.println("Tienes que introducir 'S' para indicar que si o 'N' para indicar que no.");
			}
		} while (!turno.equalsIgnoreCase("N"));

		System.out.println();

		// Señalamos de que jugador es el turno
		System.out.println("Es el turno del jugador 2");

		// Bucle para el turno del jugador 2
		do {
			// Preguntamos al jugador si quiere sacar una carta
			System.out.println("¿Quieres sacar una carta?");
			turno = sc.nextLine();
			// Vuelvo a poner otro numero aleatorio y otro palo aleatorio
			numeroRand = rd.nextInt(1, 11);
			paloRand = rd.nextInt(1, 5);
			// Asignamos el palo
			palo = switch (paloRand) {
			case 1 -> {
				yield "oros";
			}
			case 2 -> {
				yield "copas";
			}
			case 3 -> {
				yield "espadas";
			}
			default -> {
				yield "bastos";
			}
			};
			cartaMedia = switch (numeroRand) {
			case 8 -> {
				yield "sota";
			}
			case 9 -> {
				yield "caballo";
			}
			default -> {
				yield "rey";
			}
			};

			if (turno.equalsIgnoreCase("S") || turno.equalsIgnoreCase("N")) {
				if (numeroRand > 0 && numeroRand < 8) {
					System.out.println("Tu carta es: " + numeroRand + " de " + palo);
					jugador2 += numeroRand;
					System.out.println("Tienes " + jugador2 + " puntos");
				} else {
					System.out.println("Tu carta es: " + cartaMedia + " de " + palo);
					jugador2 += 0.5;
					System.out.println("Tienes " + jugador2 + " puntos");
				}
				if (jugador2 > 7.5) {
					System.out.println("Te has pasado, has perdido");
					jugador2 = 0;
					turno = "N";
				}
			} else {
				System.out.println("Tienes que introducir 'S' para indicar que si o 'N' para indicar que no.");
			}
		} while (!turno.equalsIgnoreCase("N"));

		System.out.println("El jugador 1 tiene " + jugador1 + " puntos y el jugador 2 tiene " + jugador2 + " puntos");
		if (jugador1 == jugador2) {
			System.out.println("Habeis perdido ambos jugadores");
		} else {
			System.out.println(
					"Enhorabuena " + (jugador1 > jugador2 ? "jugador 1" : "jugador 2") + " has ganado la partida");
		}
	}

}
