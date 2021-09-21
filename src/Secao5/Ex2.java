package Secao5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		sc.nextLine();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
			else {
				System.out.println("IMPAR");
				
			}
			
		sc.close();

	}

}
