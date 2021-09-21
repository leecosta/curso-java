package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, num1, num2;
		double vu1, vu2, vp;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		vu1 = sc.nextDouble();
		sc.nextLine();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		vu2 = sc.nextDouble();
		vp = num1 * vu1 + num2 * vu2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", vp);
		
		sc.close();

	}

}
