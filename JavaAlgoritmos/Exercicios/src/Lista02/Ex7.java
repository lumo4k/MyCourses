package Lista02;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double cinquenta, vintecinco, dez, cinco, umcent, soma;
		int umreal;
		
		System.out.println("Qual o valor do produto?");
		double produto = scan.nextDouble();
		
		System.out.println("Quantas moedas de 1 real Você tem?");
		umreal = scan.nextInt();
		System.out.println("Você tem um total de " + umreal + " Reais em moedas de 1 real");
		
		cinquenta = ContarMoedas("50");
		vintecinco = ContarMoedas("25");
		dez = ContarMoedas("10");
		cinco = ContarMoedas("5");
		umcent = ContarMoedas("1");
		
		soma = umreal + cinquenta + vintecinco + dez + cinco + umcent;
		
		if (produto > soma) {
			System.out.println("Você não tem dinheiro suficiente para comprar!");
		}
		else {
			System.out.println("Você pode comprar, capitalista safado!");
		}
		
		System.out.println("Você tem um total de R$ " + soma);
	}
	
	public static double ContarMoedas(String Valor) {
		Scanner scan = new Scanner(System.in);
		int moedas;
		double total;
		System.out.println("Quantas moedas de " + Valor + " Centavo(s) Você tem?");
		moedas = scan.nextInt();
		total = moedas * (Double.parseDouble(Valor) / 100);
		System.out.println("Você tem um total de: " + total + " Reais/Centavos"
				+ " em moedas de " + Valor + " Centavo(s)");
		return total;
	}
	
}
