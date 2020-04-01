package Lista03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double numero = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número para somar");
			double num = scan.nextDouble();
			
			numero += num;
		}
		
		System.out.print("A soma de tudo deu: " + numero);
	}

}
