package Exercicios;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		double n1, antecessor, sucessor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite algum numero");
		n1 = scan.nextDouble();
		antecessor = n1-1;
		sucessor = n1+1;
		
		
		System.out.println("O numero que você escreveu é: " + n1);
		System.out.println("O antecessor é: " + antecessor);
		System.out.println("O sucessor é: " + sucessor);
	}

}
