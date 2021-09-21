package Secao5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y; 
		double total;
		
		x = sc.nextInt();
		y = sc.nextInt();
		sc.nextLine();
		
		if (x == 1) {
			total = y * 4;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if (x == 2) {
			total = y * 4.5;
			System.out.printf("Total: R$ %.2f", total);	
		}
		else if (x == 3) {
			total = y * 5;
			System.out.printf("Total: R$ %.2f", total);
			
		}
		else if (x == 2) {
			total = y * 2;
			System.out.printf("Total: R$ %.2f", total);
			
		}
		else{
			total = y * 1.5;
			System.out.printf("Total: R$ %.2f", total);
			
		}
			
		sc.close();

	}

}
