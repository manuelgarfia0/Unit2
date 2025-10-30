package part5;

public class Exercise02 {

	public static void main(String[] args) {
		// Declare variables
		int num = 0;
		// Show even numbers to 200
		do {
			if (num % 2 == 0) {
				num += 2;
				System.out.println(num);
			}
		} while (num < 200);
	}

}
