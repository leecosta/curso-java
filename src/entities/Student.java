package entities;

public class Student {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double nota() {
		return n1 + n2 + n3;
	}
	
	public double notaFaltando() {
		return 60 - nota();
	}

}
