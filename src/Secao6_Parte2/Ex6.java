package Secao6_Parte2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();
		sc.nextLine();
		
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		

		sc.close();

	}

}
