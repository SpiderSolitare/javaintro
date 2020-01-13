package aufgaben;
import java.util.Locale;
import java.util.Scanner;


public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



				double o1, o2, o3, ergebnis;
				
				
				Scanner scannerVariable = new Scanner(System.in).useLocale(Locale.US);

				System.out.println("Erste Zahl bitte.");
				o1=scannerVariable.nextDouble();
				System.out.println("Zweite Zahl bitte.");
				o2=scannerVariable.nextDouble();
				System.out.println("Bitte gebe den Operator ein:\nWächle aus: \nAddition: 1 \nSubtraction: 2 \nMultiplication: 3 \nDivision: 4 ");
				o3=scannerVariable.nextDouble();
				
				if(o3 == 1) {
					
					ergebnis=o1+o2;
					System.out.println("Das Ergebnis ist: " + ergebnis);
					
				} else if(o3 == 2) {
					
					ergebnis=o1-o2;
					System.out.println("Das Ergebnis ist: " + ergebnis);
				
				} else if(o3 == 4) {
					
					ergebnis=o1/o2;
					System.out.println("Das Ergebnis ist: " + ergebnis);
					
				} else if(o3 == 3){
					
					ergebnis=o1*o2;
					System.out.println("Das Ergebnis ist: " + ergebnis);
					
				}
				
				

				

		}
	}


