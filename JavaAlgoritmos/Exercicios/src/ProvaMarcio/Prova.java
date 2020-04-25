package ProvaMarcio;

import java.util.*;
import Lista04.*;

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pessoa Luan = new Pessoa();
		
		System.out.println("Digite seu cpf para acessar o menu");
		String cpfMenu = scan.next();
		if (Luan.func.VerificaCpf(cpfMenu) == false) {
			System.exit(0);
		}
		
		int i = 0;
		while (i <= 3) {
			System.out.println("Digite sua senha para acessar o menu");
			String SenhaMenu = scan.next();
			if (Luan.func.VerificaSenha(SenhaMenu) == false) {
				i++;
				System.out.println(i + " tentativa(s) de 3 - Falha");
			} else {
				break;
			}
			if (i == 3) {
				System.out.println("Conta Bloqueada!");
				System.exit(0);
			}
		}
		
		int repeat = 1;
		while (repeat == 1) {
			System.out.println("Digite a opção que você precisa:");
			System.out.println("1- Saldo");
			System.out.println("2- Depósito");
			System.out.println("3- Saque");
			System.out.println("0- Sair");
			
			int MenuOption = scan.nextInt();
			
			if (MenuOption == 1) {
				System.out.println("O saldo da sua conta é de: R$ " + Luan.getSaldo());
			} else if (MenuOption == 2) {
				System.out.println("Quanto deseja depositar?");
				double deposito = scan.nextDouble();
				
				Luan.setSaldo(Luan.getSaldo() + deposito);
				
				System.out.println("Saldo Atual: R$ " + Luan.getSaldo());
			} else if (MenuOption == 3) {
				System.out.println("Quanto deseja sacar?");
				double deposito = scan.nextDouble();
				
				Luan.setSaldo(Luan.getSaldo() - deposito);
				
				System.out.println("Saldo Atual: R$ " + Luan.getSaldo());
			} else if (MenuOption == 0) {
				System.exit(0);
			} else {
				System.out.println("Errado, Digite novamente...");
			}
			
			while (repeat == 1) {
				System.out.println("Deseja realizar outra operação?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				int operacao = scan.nextInt();
				
				if (operacao == 1) {
					break;
				} else if (operacao == 2) {
					System.exit(0);
				} else {
					System.out.println("Operação Errada!");
				}
			}
		}
	}
}
