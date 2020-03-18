package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		String var1, var2, z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite algo aqui:");
		var1 = scan.next();
		
		System.out.println("Digite algo aqui também");
		var2 = scan.next();
		
		System.out.println("Antes...");
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		int EscolhaNumero = 0;
		while (EscolhaNumero != 1) {
			System.out.println("Digite 1");
			EscolhaNumero = scan.nextInt();
		}
		
		System.out.println("Depois...");
		
		z = var1;
		var1 = var2;
		var2 = z;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
	}

}
