package Lista03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = scan.next();
		
		System.out.println("Digite o número de vezes para seu nome aparecer:");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println(i+1 + "-" + nome);
		}
	}

}
