package Lista02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double produto = scan.nextDouble();
		
		if (produto <= 20) {
			produto *= 1.45;
			System.out.println("O valor final do produto é R$ " + produto);
		}
		else {
			produto *= 1.30;
			System.out.println("O valor final do produto é R$ " + produto);
		}
		
		
	}

}
