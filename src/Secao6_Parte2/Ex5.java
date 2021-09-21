package Secao6_Parte2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, fatorial;

		n = sc.nextInt();
		sc.nextLine();
		
		fatorial = 1;
		
		for (int i=n; i>0; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);

		sc.close();

	}

}
