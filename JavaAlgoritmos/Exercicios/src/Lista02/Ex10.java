package Lista02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex10 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Double> numeros = new ArrayList<Double>();
		numeros.add(PegaNumero("Primeiro"));
		numeros.add(PegaNumero("Segundo"));
		numeros.add(PegaNumero("Terceiro"));
		
		double result = 0;
		
		for (int i = 0; i < numeros.size(); i+=1) {
			if (numeros.get(i) >= result) {
				result = numeros.get(i);
			}
		}
		
		System.out.println("O maior número é " + result);
		
	}
	
	public static double PegaNumero(String nome) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o " + nome + " número aleatório");
		double numero = scan.nextDouble();
		return numero;
	}
}
