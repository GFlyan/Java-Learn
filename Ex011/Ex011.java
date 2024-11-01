//Escreva um programa que calcule a velocidade média de um objeto.

import java.util.Scanner;

public class Ex011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o espaço:");
		double espaco = scan.nextDouble();
		System.out.println("Informe o tempo:");
		double tempo = scan.nextDouble();
		double velocidade = espaco / tempo;
		System.out.println("A velocidade média é:" + velocidade);
		scan.close();
	}
}
