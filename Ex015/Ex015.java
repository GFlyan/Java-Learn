/*Crie um programa que solicite ao usuário
 * o valor do raio de uma esfera e calcule
 * e exiba seu volume.*/

import java.util.Scanner;

public class Ex015 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do raio:");
		double raio = scan.nextDouble();
		double volume = 4/3 *  Math.PI * Math.pow(raio, 3);
		System.out.println("O volume da esfera é: " + volume);
		scan.close();
	}
}
