import java.util.Scanner;

public class Aula02 {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		
		int saldo = 450;
		
		if (saldo >= 5000) {
			System.out.println("Burguês safado!");
		}
		else {
			System.out.println("Ta osso quebrada!");
		}
		
		//Calcular média do aluno
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: \n");
		double n1 = sc.nextDouble();
		while (n1 > 10 || n1 < 0) {
			System.out.print("digite novamente: ");
			n1 = sc.nextDouble();
		}
		
		System.out.print("Digite a nota 2: \n");
		double n2 = sc.nextDouble();
		while (n2 > 10 || n2 < 0) {
			System.out.print("digite novamente: ");
			n2 = sc.nextDouble();
		}
		
		System.out.print("Digite a nota 3: \n");
		double n3 = sc.nextDouble();
		while (n3 > 10 || n3 < 0) {
			System.out.print("digite novamente: ");
			n3 = sc.nextDouble();
		}
		
		System.out.print("Digite a nota 4: \n");
		double n4 = sc.nextDouble();
		while (n4 > 10 || n4 < 0) {
			System.out.print("digite novamente: ");
			n4 = sc.nextDouble();
		}
		
		double NotaMedia = (n1 + n2 + n3 + n4)/4;
		
		if (NotaMedia >= 0 && NotaMedia <= 5) {
			System.out.println("Reprovado!");
			System.out.print("Sua nota foi: " + NotaMedia);
		}
		else if (NotaMedia > 5 && NotaMedia <= 8) {
			System.out.println("Aprovado!");
			System.out.print("Sua nota foi: " + NotaMedia);
		}
		else {
			System.out.println("Especial!");
			System.out.print("Sua nota foi: " + NotaMedia);
		}
	}
}
