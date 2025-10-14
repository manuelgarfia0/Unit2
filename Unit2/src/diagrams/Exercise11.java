package diagrams;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		String name;
		int hours;
		int fee;
		double rates;
		double grossSalary;
		double netSalary;
		// Ask data to user
		System.out.println("Introduce your name: ");
		name = sc.nextLine();
		System.out.println("Introduce how many hours did you work: ");
		hours = sc.nextInt();
		System.out.println("Introduce the fee: ");
		fee = sc.nextInt();
		// Calculate all
		if (hours < 35) {
			grossSalary = hours * fee;
		} else {
			grossSalary = 35 * fee + (hours - 35) * fee;
		}

		if (grossSalary <= 500) {
			rates = 0;
			netSalary = grossSalary;
		} else if (grossSalary <= 900) {
			rates = grossSalary * 0.25;
			netSalary = grossSalary - grossSalary * 0.25;
		} else {
			rates = grossSalary * 0.45;
			netSalary = grossSalary - grossSalary * 0.45;
		}
		// Show info
		System.out.println("Name: " + name + " Rates: " + rates + "Net Salary: " + netSalary);

	}

}
