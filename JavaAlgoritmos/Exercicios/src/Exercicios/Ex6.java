package Exercicios;

import java.util.Scanner;

public class Ex6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite algum numero: ");
		double n1 = scan.nextDouble();
		
		if (n1%2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}		
	}
}
