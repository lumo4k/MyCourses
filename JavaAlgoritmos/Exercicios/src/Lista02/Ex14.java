package Lista02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double salariominimo = 1045.00;
		double precokw = salariominimo / 7;
		
		System.out.println("Quantos KiloWatts você gastou no mês? ");
		double kilowatts = scan.nextDouble();
		
		System.out.println("O preco total a pagar é: R$ " + (((kilowatts /100) * precokw)) * 0.9);
		
		
	}

}
