package homework;

import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		int z1, z2;
		Scanner scannerVariable = new Scanner(System.in);

		System.out.println("Erste Zahl: ");
		z1=scannerVariable.nextInt();

		System.out.println("Zweite Zahl: ");
		z2=scannerVariable.nextInt();

		System.out.println(z1 + "+" + z2 + "=" + (z1 + z2));
	}

}
