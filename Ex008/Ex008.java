/*Escreva um programa que calcule o delta de uma equação
 * de segundo grau.*/

import java.util.Scanner;

public class Ex008 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor de a:");
		double aCoeficiente = scan.nextDouble();
		System.out.println("Informe o valor de b:");
		double bCoeficiente = scan.nextDouble();
		System.out.println("Informe o valor de c:");
		double cCoeficiente = scan.nextDouble();
		double delta = Math.pow(bCoeficiente, 2) - (4 * aCoeficiente * bCoeficiente);
		System.out.println("O valor do delta é: " + delta);
		scan.close();
	}
}
