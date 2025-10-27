package part4;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int height;
		int higherTree = 0;
		// Ask data to user
		System.out.println("Introduce the height of a tree: ");
		height = sc.nextInt();
		// Loop
		while (height >= 0) {
			if (height > higherTree) {
				higherTree = height;
			}
			// Ask the height of another tree
			System.out.println("Introduce the height of another tree: ");
			height = sc.nextInt();
		}
		// Show the higher tree
		System.out.println("The higher tree is " + higherTree + " cm");
	}

}
