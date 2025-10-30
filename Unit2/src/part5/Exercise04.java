package part5;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int numMult = 0;
		int answer;
		// Ask number to user
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Show multiplications
		do {
			numMult++;
			answer = num * numMult;
			System.out.println(num + " * " + numMult + " = " + answer);
		} while (answer < (num * 10));
		// Close scanner
		sc.close();
	}

}
