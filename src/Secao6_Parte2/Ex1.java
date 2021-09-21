package Secao6_Parte2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();
		sc.nextLine();
		
		if (x > 0 && x < 1001) {
			for (int i=0; i<=x; i++ ) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		}

		sc.close();

	}

}
