package revisao_conceitos_basico;

public class DoWhileEmJava {
	public static void main(String[] args) {
		int tentativa = 1;
		do {
			tentativa += 1;
			System.out.println("To tentando po");
		} while(tentativa < 3);
		System.out.println("pronto");
	}
}
