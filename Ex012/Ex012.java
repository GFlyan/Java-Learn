/*Escreva um programa que calcule a energia cinética
 * de um objeto em movimento.*/

import java.util.Scanner;

public class Ex012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a massa:");
		double massa = scan.nextDouble();
		System.out.println("Informe a velocidade:");
		double velocidade = scan.nextDouble();
		double energia = (massa * Math.pow(velocidade, 2))/2;
		System.out.println("A energia cinética é:" + energia); 
		scan.close();
	}
}
