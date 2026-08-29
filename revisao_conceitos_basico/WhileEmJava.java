package revisao_conceitos_basico;

public class WhileEmJava {
	public static void main(String[] args) {
		int contador = 0; //O teste acontece no começo do código, se for falso desde o começo o código nunca inicia
		
		while (contador < 5) {
			contador += 1;
			System.out.println(contador);
		}
	}
}
