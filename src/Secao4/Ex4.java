package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		double horas, valor, salary;
		
		number = sc.nextInt();
		sc.nextLine();
		horas = sc.nextDouble();
		sc.nextLine();
		valor = sc.nextDouble();
		salary = horas * valor;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();

	}

}
