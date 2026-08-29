package exercicios;

import java.util.Scanner;

public class AoQuadradoEcubo {
	public static void main(String[] args) {
		//Crie um programa que receba um valor, retorne ao quadrado e ao cubo
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		String valor = entrada.next();
		Double nValor = Double.parseDouble(valor);
		
		System.out.printf("Ao quadrado: %.2f\n", Math.pow(nValor, 2));
		System.out.printf("Ao cubo: %.2f", Math.pow(nValor, 3));
	}
}
