package Lista02;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double Nota1 = scan.nextDouble();
		
		System.out.println("Digite a Segunda nota: ");
		double Nota2 = scan.nextDouble();
		
		System.out.println("Digite a Terceira nota: ");
		double Nota3 = scan.nextDouble();
		
		System.out.println("Digite a Quarta nota: ");
		double Nota4 = scan.nextDouble();
		
		double media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
		
		if (media >= 7) {
			System.out.println("Aprovado! Parabéns! ");
		}
		else if (media >= 5 && media < 7) {
			System.out.println("Exame final, boa sorte! ");
		}
		else {
			System.out.println("Reprovado, se esforce mais na próxima! ");
		}
		
		System.out.println("Sua nota final foi...  " + media);

	}

}
