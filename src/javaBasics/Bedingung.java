package javaBasics;

public class Bedingung {

	public static void main(String[] args) {

		if (1 < 3) {
			System.out.println("1 ist kleiner als 3");
		}

		/*
		 * if( 3 < 1) { System.out.println("3 ist kleiner als 1") }
		 */

		int Z1 = 3, Z2 = 1;

		if (Z1 < Z2) {

			System.out.println(Z1 + " ist kleiner als " + Z2);

		} else {

			System.out.println(Z1 + " nicht kleiner als " + Z2);

		}

		if ("hans" == "hans") {
			System.out.println("Hans");
		}

		String N1 = "hans", N2 = "hans";

		if (N1 == N2) {

			System.out.println("Hansi");

		}
		// alte Version
		if ("Paul".equals("Paul")) {
			System.out.println("Paul");
		}

		// Klammern
		if (0 < 1) {
			System.out.println("juhu");
		}
		System.out.println("haha");
		
		//Rest
		System.out.println(9 % 3);

	}

}
