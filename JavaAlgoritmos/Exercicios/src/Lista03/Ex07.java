package Lista03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ler a idade de 20 pessoas e somar");
		double numero = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite sua idade para somar");
			double num = scan.nextDouble();
			
			numero += num;
		}
		numero = numero/20;
		System.out.print("A Media de idades é: " + numero);
		
	}
}
