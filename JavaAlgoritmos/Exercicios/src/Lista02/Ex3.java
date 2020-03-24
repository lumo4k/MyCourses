package Lista02;

import java.util.Scanner;

public class Ex3 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double Nota1 = scan.nextDouble();
		
		System.out.println("Digite a Segunda nota: ");
		double Nota2 = scan.nextDouble();
		
		System.out.println("Digite a Terceira nota: ");
		double Nota3 = scan.nextDouble();
		
		double media = (Nota1 + Nota2 + Nota3) / 3;
		
		if (media >= 7) {
			System.out.println("Aprovado! Parabéns ");
		}
		else {
			System.out.println("Reprovado... Se esforce mais! ");
		}
		
	}
}
