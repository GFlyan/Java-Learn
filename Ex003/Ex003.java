/*Crie um programa que calcule e exiba a média aritmética
 * entre três notas informadas pelo usuário.*/

import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite três números para saber a média entre eles.");
		System.out.println("Digite o primeiro número:");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = scan.nextDouble();
		System.out.println("Digite o terceiro número:");
		double num3 = scan.nextDouble();
		double media = (num1 + num2 + num3) / 3;
		System.out.println("A média entre os três números informados é " + media);
		scan.close();
	}
}
