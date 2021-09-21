package Secao8;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.nome = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.nota());
		
		if (student.nota() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.notaFaltando());
		}
		else {
			System.out.println("PASS");
		}
			
		
		sc.close();

	}

}
