import java.util.Scanner;

import javax.swing.JOptionPane;
public class TEST {
	public static void main(String[] args) {
		int num = 1;
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String mensagem = "Olá " + nome + ".";
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
