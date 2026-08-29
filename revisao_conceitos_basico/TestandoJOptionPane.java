package revisao_conceitos_basico;

import javax.swing.JOptionPane;

public class TestandoJOptionPane {
	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Digite um numero: ");
		String numero2 = JOptionPane.showInputDialog("Digite outro número: ");
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		JOptionPane.showMessageDialog(null, "Aperte em ok para ver a soma");
		JOptionPane.showMessageDialog(null, n1 + n2);
		//JOptionPane.showMessageDialog(null, nome);
		
	}
}
