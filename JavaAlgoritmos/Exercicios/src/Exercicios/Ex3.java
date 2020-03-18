package Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		double area, altura, base;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a altura do triangulo: \n");
		altura = scan.nextDouble();
		
		System.out.print("Digite a base do triangulo: \n");
		base = scan.nextDouble();
		
		area = altura * base;
		
		System.out.print("A area do retangulo é: " + area + "Metros²");
		
	}

}
