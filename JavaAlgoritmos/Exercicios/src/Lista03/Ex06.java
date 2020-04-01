package Lista03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ler a idade de 20 pessoas e somar");
		int numero = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite sua idade para somar");
			int num = scan.nextInt();
			
			numero += num;
		}
		
		System.out.print("A soma das idades é: " + numero);
		
	}
}
