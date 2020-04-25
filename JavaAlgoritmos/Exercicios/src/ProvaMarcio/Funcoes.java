package ProvaMarcio;

public class Funcoes {
	public boolean VerificaCpf(String cpf) {
		
		if (Pessoa.getCpf().contentEquals(cpf)) {
			System.out.println("CPF válido");
			return true;
		} else {
			System.out.println("CPF inválido");
			return false;
		}
	}
	
public static boolean VerificaSenha(String senha) {
		
		if (Pessoa.getSenha().contentEquals(senha)) {
			System.out.println("Senha válida");
			return true;
		} else {
			System.out.println("Senha inválida");
			return false;
		}
	}
}
