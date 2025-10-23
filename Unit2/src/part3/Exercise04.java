package part3;

import java.util.Random;
import java.util.Scanner;

/*
 * if the answer is correct
 * num1: 4
 * num2: 5
 * Input: 9
 * Output: Correct
 * 
 * if the answer is incorrect
 * num1: 4
 * num2: 5
 * Input: 3
 * Output: Wrong
 */
public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner and random
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// Declare variables
		int num1 = rd.nextInt(1, 100);
		int num2 = rd.nextInt(1, 100);
		int addNum = num1 + num2;
		int answer;
		// Show numbers to user and ask him the answer of the addition
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("Introduce the answer of adding those numbers: ");
		answer = sc.nextInt();
		// Check if the answer is correct
		if (answer == addNum) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}
		// Close scanner
		sc.close();
	}

}
