package Exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite o segundo numero");
		double n2 = scan.nextDouble();
		
		if (n1 > n2) {
			System.out.println("O numero 1 é maior");
		}
		else if(n2 > n1) {
			System.out.println("O numero 2 é maior");
		}
		else {
			System.out.println("São iguais");
		}
		
		

	}

}
