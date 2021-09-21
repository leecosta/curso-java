package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;


public class ExProposto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		
		List<Employees> list = new ArrayList<>();
		
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			int idTest = id;
			Employees emp = list.stream().filter(x -> x.getId() == idTest).findFirst().orElse(null);
			while (emp != null) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
				int idTeste = id;
				emp = list.stream().filter(x -> x.getId() == idTeste).findFirst().orElse(null);
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employees(id, name, salary));
		}


		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);		
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employees obj : list) {
			System.out.println(obj);
		}
			
		
		
		sc.close();
		

	}

}
