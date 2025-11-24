package part7;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce both numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int max = Math.max(num1, num2);
		int mcm = max;

		while (mcm % num1 != 0 || mcm % num2 != 0) {
			mcm++;
		}

		System.out.println("The mcm is " + mcm);
		sc.close();
	}
}
