package part3;

import java.util.Scanner;

/*
 * if distance is lower than 800 and numDays is lower than 7
 * Input: distance -> 799
 * 			numDays -> 6
 * Output: 1750
 * 
 * if distance is higher than 800 and numDays is higher than 7
 * Input: distance -> 801
 * 			numDays -> 8
 * Output: 1401.75
 */
public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final double DISCOUNT = 0.30;
		final double PRICE_KM = 2.5;
		final int MAX_DISTANCE = 800;
		final int MAX_DAYS = 7;
		// Declare variables
		int distance;
		int numDays;
		double price;
		double finalPrice;
		// Ask data to user
		System.out.println("Introduce the distance and the number of days of the travel: ");
		distance = sc.nextInt();
		numDays = sc.nextInt();
		// Calculate the price
		price = (PRICE_KM * distance);
		// Calculate the final price if have discount
		if (numDays > MAX_DAYS && distance > MAX_DISTANCE) {
			finalPrice = price - price * DISCOUNT;
		} else {
			finalPrice = price;
		}
		System.out.println("The price is " + finalPrice);
		// Close scanner
		sc.close();
	}

}
