package ProvaMarcio;

public class Funcoes {
	public boolean VerificaCpf(String cpf) {
		
		if (Pessoa.getCpf().contentEquals(cpf)) {
			System.out.println("CPF v�lido");
			return true;
		} else {
			System.out.println("CPF inv�lido");
			return false;
		}
	}
	
public static boolean VerificaSenha(String senha) {
		
		if (Pessoa.getSenha().contentEquals(senha)) {
			System.out.println("Senha v�lida");
			return true;
		} else {
			System.out.println("Senha inv�lida");
			return false;
		}
	}
}
