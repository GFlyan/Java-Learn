/*Escreva um programa que calcule o IMC de um indivíduo
 * Fórmula: IMC = peso / altura²*/

import java.util.Scanner;

public class Ex005 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu peso:");
		double peso = scan.nextDouble();
		System.out.println("Informe sua altura:");
		double altura = scan.nextDouble();
		double imc = peso / Math.pow(altura, 2);
		System.out.println("Seu IMC é " + imc);
		scan.close();
	}
}
