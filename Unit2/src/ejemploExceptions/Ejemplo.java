package ejemploExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		try {
			num = sc.nextInt();
			assert (num > 0 && num < 100) : "Número fuera de límites";
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("No has introducido un número");
		} finally {
			sc.close();
		}
	}

}