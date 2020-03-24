package Lista02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double salario, emprestimo;
		int prestacao;
		
		System.out.println("Digite seu salário");
		salario = scan.nextDouble();
		while (salario <= 0 ) {
			System.out.println("Digite seu salário");
			salario = scan.nextDouble();
		}
		
		double TotalEmprestimo = salario * 0.30;
		
		System.out.println("Digite o valor do emprestimo");
		emprestimo = scan.nextDouble();
		while (emprestimo < 0 ) {
			System.out.println("Digite o valor do emprestimo");
			emprestimo = scan.nextDouble();
		}
		
		if (emprestimo <= TotalEmprestimo) {
			System.out.println("Emprestimo concedido!");
			System.out.println("Digite a quantidade de prestações a serem pagas: ");
			prestacao = scan.nextInt();
			while (prestacao <= 0 ) {
				System.out.println("Digite a quantidade de prestações a serem pagas: ");
				prestacao = scan.nextInt();
			}
			
			System.out.println("Suaves parcelas de R$ " + (emprestimo / prestacao));
		}
		else {
			System.out.println("Emprestimo NEGADO!");
		}
		
		
	}

}
