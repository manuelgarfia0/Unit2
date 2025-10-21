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
		// Declare constant
		final double discount = 0.30;
		// Declare variables
		int distance;
		int numDays;
		double priceKM = 2.5;
		double price;
		double finalPrice;
		// Ask data to user
		System.out.println("Introduce the distance and the number of days of the travel: ");
		distance = sc.nextInt();
		numDays = sc.nextInt();
		// Calculate the price
		price = (priceKM * distance);
		// Calculate the final price if have discount
		if (numDays > 7 && distance > 800) {
			finalPrice = price - price * discount;
		} else {
			finalPrice = price;
		}
		System.out.println("The price is " + finalPrice);
	}

}
