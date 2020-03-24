package Lista02;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num = scan.nextInt();
		
		if (num < 3) {
			System.out.println("O numero é menor que 3");
		}
		else if (num > 25) {
			System.out.println("O número é maior que 25");
		}
		else {
			System.out.println("O número está entre 3 e 25");
		}
		
		
	}
}
