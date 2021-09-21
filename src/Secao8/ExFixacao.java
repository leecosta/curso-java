package Secao8;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ExFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double qtde = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.conversao(dollar, qtde));
		
		sc.close();
	}

}
