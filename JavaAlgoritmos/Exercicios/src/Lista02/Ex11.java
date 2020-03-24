package Lista02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double n1, n2;
		n1 = PegaNumero("Primeiro");
		n2 = PegaNumero("Segundo");
		
		double soma = n1 + n2;
		
		if (soma > 20) {
			soma += 8;
			System.out.println("O total da soma é maior que 20, soma 8 e temos: " + soma);
		}
		else {
			soma -= 5;
			System.out.println("O total da soma é menor que 20, subtrai 5 e temos: " + soma);
		}
		
	}
	static double PegaNumero(String numeracao) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o " + numeracao + " número a ser somado");
		double numero = scan.nextDouble();
		return numero;
	}
}
