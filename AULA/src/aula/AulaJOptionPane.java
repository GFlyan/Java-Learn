package aula;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AulaJOptionPane {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int opcaoConvertida = 0;
		
		do {
			//Programa que calcula a area e perimetro de figuras geométricas
			//Usando a entrada e saida textual
			
			
			
			//Começar a interagir com o usuário
			String mensagemInicial = 
					"Informe qual a figura desejada:\n"
					+ "1 - Quadrado\n"
					+ "2 - Retângulo\n"
					+ "...\n"
					+ "0 - Sair";
			String opcao = JOptionPane.showInputDialog(mensagemInicial);
			opcaoConvertida = Integer.parseInt(opcao);
			
			//Ler opção do teclado
			//opcao = JOptionPane.showInputDialog(mensagemInicial)

			switch (opcaoConvertida) {
			
			case 1: 
				//Armazena o valor do lado do quadrado
				String mensagem = "Informe o valor do lado do quadrado:";
				String ladoQuadradoString = JOptionPane.showInputDialog(mensagem);
				double ladoQuadrado = Double.parseDouble(ladoQuadradoString);
				
				//Calcula área e perimetro do quadrado
				double perimetroQuadrado = 4 * ladoQuadrado;
				double areaQuadrado = Math.pow(ladoQuadrado, 2);
				
				//Resposta ao usuário
				String respostaQuadrado = 
						"O perimetro do quadrado é: " + perimetroQuadrado + ".\n"
						+ "A área do quadrado é: " + areaQuadrado + ".";
				JOptionPane.showMessageDialog(null, respostaQuadrado);
				
				break;
				
			case 2: 
				
				//Armazena o valor do comprimentro do retângulo
				String mensagemComprimento = "Informe o comprimento do retângulo:";
				String comprimentoRetanguloString =  JOptionPane.showInputDialog(mensagemComprimento);
				double comprimentoRetangulo = Double.parseDouble(comprimentoRetanguloString);
				
				//Armazena o valor da largura do retangulo
				String mensagemLargura = "Informe a largura do retângulo:";
				String larguraRetanguloString = JOptionPane.showInputDialog(mensagemLargura);
				double larguraRetangulo = Double.parseDouble(larguraRetanguloString);
				
				//Calcula o valor do perimetro do retângulo
				double perimetroRetangulo = 2 * (comprimentoRetangulo + larguraRetangulo);
				
				//Calcula o valor da área do retângulo
				double areaRetangulo = comprimentoRetangulo * larguraRetangulo;
				
				//Resposta ao usuário
				String respostaRetangulo = 
						"O perimetro do retângulo é: " + perimetroRetangulo + ".\n"
						+ "A área do retângulo é: " + areaRetangulo + ".";
				JOptionPane.showMessageDialog(null, respostaRetangulo);
				
				break;
			 }
			}
		while (opcaoConvertida != 0);
		scan.close();
		String mensagemFinal = "Programa finalizado.";
		JOptionPane.showMessageDialog(null, mensagemFinal);
	}


}
