package revisao_conceitos_basico;
import java.util.Scanner;
public class ConversaoDeDados {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		String numero1 = entrada.nextLine();
		System.out.println(numero1 + "a"); //Concatena por que são strings
		
		//Converter string para numero (int)
		int n1 = Integer.parseInt(numero1);
		System.out.println(n1 + 20);
		
		double n = Double.parseDouble(numero1);
		System.out.println(n);
		
	}
}
