package Lista02;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int num = scan.nextInt();
		
		if (num >= 100 && num <= 200) {
			System.out.println("O numero est� entre 100 e 200");
		}
		else {
			System.out.println("O n�mero est� fora de 100 e 200");
		}
		
		
	}

}
