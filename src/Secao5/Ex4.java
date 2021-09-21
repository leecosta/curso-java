package Secao5;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y, h1, h2;
		
		x = sc.nextInt();
		y = sc.nextInt();
		sc.nextLine();
		
		h1 = 24 - x + y;
		h2 = y - x;
		
		if (x > y) {
			System.out.println("O JOGO DUROU " + h1 + " HORA(S)");
		}
		else if (x == y) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else {
			System.out.println("O JOGO DUROU " + h2 + " HORA(S)");
		}
				
			
			
		sc.close();

	}

}
