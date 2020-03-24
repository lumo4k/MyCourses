package Lista02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		List<Double> notas = new ArrayList<Double>();
		
		for (int i = 0; i < 4; i += 1) {
			notas.add(PegaNota(i+1));
		}
		
		double sum = 0;
		for (int i = 0; i < notas.size(); i++) {
			sum += notas.get(i);
		}
		
		System.out.println("Digite a quantidade de faltas");
		int faltas = scan.nextInt();
		
		double media = sum / 4;
		
		if (media >= 7 && faltas <= 36) {
			System.out.println("Aprovado! Parabéns! ");
		}
		else if (media >= 5 && media < 7 && faltas <= 36) {
			System.out.println("Exame final, boa sorte! ");
		}
		else {
			System.out.println("Reprovado, se esforce mais na próxima! ");
		}
		
		System.out.println("Sua nota final foi...  " + media);
		System.out.println("Você teve " + faltas + " Faltas.");
	}

	
	static double PegaNota(int numero) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a " + numero + "ª nota: ");
		double Nota = scan.nextDouble();
		while (Nota < 0 || Nota > 10) {
			System.out.println("Errado, entre 0 e 10!");
			System.out.println("Digite a " + numero + "ª nota: ");
			Nota = scan.nextDouble();
		}
		return Nota;
	}

}
