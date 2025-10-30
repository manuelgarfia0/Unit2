package part5;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num = 0;
		int userNum;
		int add = 0;
		// Ask number to user
		System.out.println("Introduce a number: ");
		userNum = sc.nextInt();
		// Add numbers to number introduced
		do {
			num++;
			add += num;
			System.out.print(num + " + ");
		} while (num < userNum);
		System.out.println(" = " + add);
		// Close scanner
		sc.close();
	}

}
