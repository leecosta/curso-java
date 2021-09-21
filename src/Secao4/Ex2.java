package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
		

	}

}
