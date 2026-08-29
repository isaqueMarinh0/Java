package exercicios;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso: ");
		Double peso = entrada.nextDouble();
		
		System.out.print("Altura (em metros): ");
		Double altura = entrada.nextDouble();
		
		Double Imc = peso / (Math.pow(altura, 2));
		System.out.printf("IMC: %f", Imc);
		
		entrada.close();
	}
}
