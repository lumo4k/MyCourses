package Lista03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Numeros Pares");
		int numeros = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um numero de sua escolha");
			double num = scan.nextDouble();
			
			if (num%2 == 0) {
				System.out.println("O número digitado é par, Num: " + num);
				numeros += 1;
			}
		}

		System.out.print("Digitaram " + numeros + " numeros pares");
		
	}
}
