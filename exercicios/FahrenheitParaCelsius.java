package exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		//	(32 °F − 32) × 5/9 = 0 °C
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Double fah = entrada.nextDouble();
		System.out.printf("%f para Celsius: %f", fah, (fah - 32) * 5/9);
	}
}
