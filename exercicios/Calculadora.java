package exercicios;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		System.out.print("(*, -, +, /, %):  ");
		String operador = entrada.next();
		
		if (operador.equals("*"))//Comparanado strings {
			System.out.printf("%.2f x %.2f = %.2f", num1, num2, num1*num2); //Realizando o calculo
		}
		//preguiça de fazer o resto lol kkkk
	}
