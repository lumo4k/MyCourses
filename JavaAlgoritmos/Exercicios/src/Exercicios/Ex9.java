package Exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double celsius, far, resul = 0;
		int op;
		
		System.out.println("Voce deseja converter: \n"
				+ "1 - Celsius em Fahrenheit \n"
				+ "2 - Fahrenheit em Celsius");
		op = scan.nextInt();
		
		if (op == 1) {
			System.out.println("Digite a quantidade em Celsius:");
			celsius = scan.nextDouble();
			resul = (celsius * 9/5) + 32;
		}
		else if (op == 2) {
			System.out.println("Digite a quantidade em Fahrenhit:");
			far = scan.nextDouble();
			resul = (far - 32) * 5 / 9;
		}
		else {
			System.out.println("Wrong Option!");
		}
		
		System.out.println(resul);

	}

}
