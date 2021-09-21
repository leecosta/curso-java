package Secao9;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Ex {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double deposito = 0;
		
		System.out.print("Enter account number: ");
		int num = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char existeDeposito = sc.next().charAt(0);
		if (existeDeposito == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposito = sc.nextDouble();
		}
		
		Banco banco = new Banco(num, titular, deposito);	
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(banco);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		sc.nextLine();
		banco.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(banco);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		deposito = sc.nextDouble();
		banco.saque(deposito);
		System.out.println("Updated account data: ");
		System.out.println(banco);
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
