 /*Escreva um programa que solicite ao usuário dois números 
 * e exiba a soma, subtração, multiplicação e divisão entre eles.*/

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Definindo os números
		System.out.println("Digite o primeiro número:");
		double firstNumber = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		double secondNumber = scan.nextDouble();
		
		//Soma
		System.out.println(firstNumber + secondNumber);
		
		//Substração
		System.out.println(firstNumber - secondNumber);
		
		//Multiplicação
		System.out.println(firstNumber * secondNumber);
		
		//Divisão
		System.out.println(firstNumber / secondNumber);
		
		scan.close();
	}

}
