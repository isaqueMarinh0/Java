package provaLogicaDeProgramacao;

import java.util.Scanner;

public class Ex1_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String raio = entrada.nextLine();
		Double nRaio = Double.parseDouble(raio);
		Double pi = 3.14159;
		Double area = pi * (Math.pow(nRaio, 2));
		System.out.printf("%.4f", area);
	}
}
