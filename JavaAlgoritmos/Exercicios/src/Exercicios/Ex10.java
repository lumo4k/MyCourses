package Exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a,b,c,delta,r1 = 0,r2 = 5;
		
		System.out.println("Digite o numero ao quadrado: ");
		a = scan.nextDouble();
		
		System.out.println("Digite o numero B: ");
		b = scan.nextDouble();
		
		System.out.println("Digite o numero C: ");
		c = scan.nextDouble();
		
		delta = (Math.pow(b,2) - 4 * a * c);
		
		if (delta < 0 ) {
			System.out.println("Não existe raiz real");
		} 
		else {
			r1 = (-b + (Math.sqrt(delta)))/(2*a);
			r2 = (-b - (Math.sqrt(delta)))/(2*a);
		}
		
		
		System.out.println(delta);
		System.out.println(r1 + " " + r2);

	}

}
