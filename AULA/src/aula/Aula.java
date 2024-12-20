package aula;

import java.util.Scanner;

public class Aula {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
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
			System.out.println(mensagemInicial);
			
			//Ler opção do teclado
			opcao = scan.nextInt();

			switch (opcao) {
			
			case 1: 
				//Armazena o valor do lado do quadrado
				String mensagem = "Informe o valor do lado do quadrado:";
				System.out.println(mensagem);
				double ladoQuadrado = scan.nextDouble();
				
				//Calcula área e perimetro do quadrado
				double perimetroQuadrado = 4 * ladoQuadrado;
				double areaQuadrado = Math.pow(ladoQuadrado, 2);
				
				//Resposta ao usuário
				String respostaQuadrado = 
						"O perimetro do quadrado é: " + perimetroQuadrado + ".\n"
						+ "A área do quadrado é: " + areaQuadrado + ".";
				System.out.println(respostaQuadrado);
				
				break;
				
			case 2: 
				
				//Armazena o valor do comprimentro do retângulo
				String mensagemComprimento = "Informe o comprimento do retângulo:";
				System.out.println(mensagemComprimento);
				double comprimentoRetangulo = scan.nextDouble();
				
				//Armazena o valor da largura do retangulo
				String mensagemLargura = "Informe a largura do retângulo:";
				System.out.println(mensagemLargura);
				double larguraRetangulo = scan.nextDouble();
				
				//Calcula o valor do perimetro do retângulo
				double perimetroRetangulo = 2 * (comprimentoRetangulo + larguraRetangulo);
				
				//Calcula o valor da área do retângulo
				double areaRetangulo = comprimentoRetangulo * larguraRetangulo;
				
				//Resposta ao usuário
				String respostaRetangulo = 
						"O perimetro do retângulo é: " + perimetroRetangulo + ".\n"
						+ "A área do retângulo é: " + areaRetangulo + ".";
				System.out.println(respostaRetangulo);
				
				break;
			 }
			}
		while (opcao != 0);
		scan.close();
	}

}
