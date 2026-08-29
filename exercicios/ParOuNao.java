package exercicios;
import java.util.Scanner;
public class ParOuNao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		if (n >= 0 && n <= 10) {
			if(n % 2 == 0) {
				System.out.println("É par");
			}
		}
		entrada.close();
	}
}
