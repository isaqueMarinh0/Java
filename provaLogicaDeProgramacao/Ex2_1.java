package provaLogicaDeProgramacao;

import java.util.Scanner;

public class Ex2_1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double escolha = entrada.nextDouble();
		double quantidade = entrada.nextDouble();
		
		//Tabela de precos
		double cod1 = 4;
		double cod2 = 4.5;
		double cod3 = 5;
		double cod4 = 2;
		double cod5 = 1.5;
		
		//Variavel que armazena o valor
		double valor;
		
		if (escolha == 1) {
			System.out.printf("Total: %.2f", cod1 * quantidade);
		}
		else if (escolha == 2) {
			System.out.printf("Total: %.2f", cod2 * quantidade);
		}
		else if (escolha == 3) {
			System.out.printf("Total: %.2f", cod3 * quantidade);
		}
		else if (escolha == 4) {
			System.out.printf("Total: %.2f", cod4 * quantidade);
		}
		else if (escolha == 5) {
			System.out.printf("Total: %.2f", cod5 * quantidade);
		}
	}
}
