package part6;

public class Exercise04 {

	public static void main(String[] args) {
		// Declare variables
		int add = 0;
		// Add 10 first odd numbers
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				add += i;
			}
		}
		System.out.println("The addition of the 10 first odd numbers: " + add);
	}

}
