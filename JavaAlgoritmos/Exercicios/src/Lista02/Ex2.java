package Lista02;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int num = scan.nextInt();
		
		if (num < 3) {
			System.out.println("O numero � menor que 3");
		}
		else if (num > 25) {
			System.out.println("O n�mero � maior que 25");
		}
		else {
			System.out.println("O n�mero est� entre 3 e 25");
		}
		
		
	}
}
