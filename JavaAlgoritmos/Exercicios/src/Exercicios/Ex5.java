package Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, resul = 0;
		
		System.out.println("Digite uma op��o: \n"
				+ "1 - Soma \n"
				+ "2 - Subtra��o \n"
				+ "3 - Multiplica��o \n"
				+ "4 - Divis�o \n"
				+ "5 - Resto \n");
		int op = scan.nextInt();
		
		System.out.println("Digite o primeiro numero");
		n1 = scan.nextDouble();
		
		System.out.println("Digite o segundo numero");
		n2 = scan.nextDouble();
		
		
		switch(op) {
		case 1:
			resul = n1 + n2;
			break;
		case 2:
			resul = n1 - n2;
			break;
		case 3:
			resul = n1 * n2;
			break;
		case 4:
			resul = n1 / n2;
			break;
		case 5:
			resul = n1 % n2;
			break;
		}
		
		System.out.println("Resultado: " + resul);
	}

}
