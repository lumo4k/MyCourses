package Lista03;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ler a idade de 20 pessoas e somar");
		int MaiorIdade = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite sua idade para somar");
			double num = scan.nextDouble();
			
			if (num >= 18) {
				MaiorIdade += 1;
			}
		}

		System.out.print("Existem " + MaiorIdade + " de maiores de idade");
		
	}
}
