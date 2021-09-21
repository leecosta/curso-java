package Secao5;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x; 
		
		x = sc.nextDouble();
		sc.nextLine();
		
		if (x >= 0 && x <= 25) {
			System.out.printf("Intervalo [0, 25]");
		}
		else if (x > 25 && x <= 50) {
			System.out.printf("Intervalo (25, 50]");	
		}
		else if (x > 50 && x <= 75) {
			System.out.printf("Intervalo (50, 75]");
		}
		else if (x > 75 && x <= 100) {
			System.out.printf("Intervalo (75, 100]");
		}
		else{
			System.out.printf("Fora de intervalo");
			
		}
			
		sc.close();

	}

}
