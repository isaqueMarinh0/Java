package revisao_conceitos_basico;

public class TrianguloFor {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {//Vai rodar 10 vezes
			for(int j = 0; j <= i; j++) { //A cada entrada nesse loop, vai rodar o quanto o i está
				System.out.print(j); //Se o i estiver em 2, vai rodar 2 vezes
			}
			System.out.print("\n");
		}
	}
}
