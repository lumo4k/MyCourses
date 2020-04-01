package Lista03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = scan.next();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1 + "-" + nome);
		}
	}

}
