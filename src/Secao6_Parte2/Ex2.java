package Secao6_Parte2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n, x, in, out;

		n = sc.nextInt();
		sc.nextLine();
		
		in = 0;
		out = 0;
		
		for (int i=0; i<n; i++) {
			x = sc.nextInt();
			if (x>= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
			}
		
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
