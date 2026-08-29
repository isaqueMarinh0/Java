package revisao_conceitos_basico;

import java.util.Scanner; //permite scanear o teclado


public class Input {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //Escaneia o teclado para obter um input
		
		//Formas de entrada
		String nome = entrada.next(); //Ler até um espaço for digitado
		String sobrenome = entrada.nextLine(); //Ler a linha inteira (até os espaços)
		int num = entrada.nextInt(); //Ler um número
		Double decimal = entrada.nextDouble();//Número decimal (, ou .)
		Boolean x = entrada.nextBoolean(); //true or false
		
		entrada.close();
	}
}
