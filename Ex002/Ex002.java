/*Escreva um programa que calcule a média aritmética de dois números*/

import java.util.Scanner;
public class Ex002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Armazenando números
		System.out.println("Digite o primeiro número:");
		double firstNumber = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		double secondNumber = scan.nextDouble();
		//Calculando média
		double media = (firstNumber + secondNumber) / 2;
		System.out.println("A média é: " + media);
		scan.close();
	}

}
