package provaLogicaDeProgramacao;

import java.util.Scanner;

public class Ex1_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String qtdPeca1 = entrada.nextLine();
		String precoPeca1 = entrada.nextLine();
		
		//Convertendo para numero
		
		double nQtdPeca1 = Double.parseDouble(qtdPeca1);
		double nPrecoPeca1 = Double.parseDouble(precoPeca1);
		
		String qtdPeca2 = entrada.nextLine();
		String precoPeca2 = entrada.nextLine();
		
		//Convertendo para numero
		
		double nQtdPeca2 = Double.parseDouble(qtdPeca2);
		double nPrecoPeca2 = Double.parseDouble(precoPeca2);
		
		System.out.print("Valor a pagar: ");
		Double valor = (nQtdPeca1 * nPrecoPeca1) + (nQtdPeca2 * nPrecoPeca2);
		System.out.println(valor);
	}
}
