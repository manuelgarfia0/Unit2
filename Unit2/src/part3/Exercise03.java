package part3;

import java.util.Scanner;

/*
 * id out of range
 * input: 100000000
 * output: Introduce a correct id
 * 
 * correct id
 * input: 27531256
 * output: A
 * 
 */
public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int id;
		int letra;
		// Ask dnia to user
		System.out.println("Introduce your id without the letter");
		id = sc.nextInt();
		// Check id is correct
		if (id > 9999999 && id < 100000000) {
			// Calculate letra
			letra = id % 23;
			// Show letter depending on the number
			switch (letra) {
			case 0 -> {
				System.out.println("T");
			}
			case 1 -> {
				System.out.println("R");
			}
			case 2 -> {
				System.out.println("W");
			}
			case 3 -> {
				System.out.println("A");
			}
			case 4 -> {
				System.out.println("G");
			}
			case 5 -> {
				System.out.println("M");
			}
			case 6 -> {
				System.out.println("Y");
			}
			case 7 -> {
				System.out.println("F");
			}
			case 8 -> {
				System.out.println("P");
			}
			case 9 -> {
				System.out.println("D");
			}
			case 10 -> {
				System.out.println("X");
			}
			case 11 -> {
				System.out.println("B");
			}
			case 12 -> {
				System.out.println("N");
			}
			case 13 -> {
				System.out.println("J");
			}
			case 14 -> {
				System.out.println("Z");
			}
			case 15 -> {
				System.out.println("S");
			}
			case 16 -> {
				System.out.println("Q");
			}
			case 17 -> {
				System.out.println("V");
			}
			case 18 -> {
				System.out.println("H");
			}
			case 19 -> {
				System.out.println("L");
			}
			case 20 -> {
				System.out.println("C");
			}
			case 21 -> {
				System.out.println("E");
			}
			case 22 -> {
				System.out.println("K");
			}
			}
		} else {
			System.out.println("Introduce a correct id");
		}
	}

}
