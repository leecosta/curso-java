package Secao6;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, alcool, gasolina, diesel;

		x = sc.nextInt();
		alcool = 0;
		gasolina = 0;
		diesel = 0;
				

		while (x != 4) {
			if (x == 1 ) {
				alcool += 1;
			}
			else if (x == 2) {
				gasolina += 1;
			}
			else if (x == 3) {
				diesel += 1;
			}
			x = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADA");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
