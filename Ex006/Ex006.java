/*Crie um programa que calcule e exiba o perímetro de um círculo
 * solicitando o raio ao usuário*/

import java.util.Scanner;

public class Ex006 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tamanho do raio:");
		double raio = scan.nextDouble();
		double perimetroCirculo = 2 * Math.PI * raio;
		System.out.println("O perímetro do círculo é: " + perimetroCirculo);
		scan.close();
	}
}
