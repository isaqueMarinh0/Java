package revisao_conceitos_basico;

public class StringsEmJava {
	public static void main(String[] args) {
		//Como string é uma classe em java, podemos fazer várias modificações
		String nome = "isaque";
		System.out.println(nome.toLowerCase()); //Minusculo
		System.out.println(nome.toUpperCase()); //Maiusculo
		
		//Comparar Strings
		System.out.println(nome.equals("Isaque")); //Retorna true, pois a variável é igual isaque
		//Podemos também comparar soq ignorando se é maisculo ou minusculo
		System.out.println(nome.equalsIgnoreCase("ISAQUE"));
		
		//Veriricar se uma string tem uma letra ou caractere especifico
		System.out.println(nome.contains("a"));
	}
}
