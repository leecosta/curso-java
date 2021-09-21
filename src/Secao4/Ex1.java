package Secao4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextInt();
		z = x + y;
		
		System.out.println("SOMA = " + z);
		
		sc.close();

	}

}
