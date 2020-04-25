package ProvaMarcio;

import ProvaMarcio.*;

public class Pessoa {
	
	private String nome = "Aleatório";
	private static String cpf = "12345678900";
	private double saldo = 1000.00;
	private static String senha = "01020304";
	Funcoes func = new Funcoes();
	
	public static String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public static String getSenha() {
		return senha;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static void setSenha(String senha) {
		Pessoa.senha = senha;
	}
	
}