package Lista03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Verificar se o número está entre 0 e 100");
		int numero = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um numero");
			double num = scan.nextDouble();
			
			if (num >= 0 && num <= 100) {
				numero += 1;
			}
		}

		System.out.print("Existem " + numero + " numeros entre 0 e 100 digitados");
		
	}
}
