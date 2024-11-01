/*Esceva um programa que calcule o perimêtro e a área 
 * de um retângulo,*/

import java.util.Scanner;

public class Ex009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a largura:");
		double largura = scan.nextDouble();
		System.out.println("Informe a altura:");
		double comprimento = scan.nextDouble();
		double perimetro = 2 * largura + 2 * comprimento;
		System.out.println("O pêrimetro é: " + perimetro);
		double area = largura * comprimento;
		System.out.println("A área é: " + area);
		scan.close();
	}

}
