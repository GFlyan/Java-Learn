/*Escreva um programa que calcule a média geométrica entre três números
 * informados pelo usuário;*/

import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double acumulate = 1;
		for(int c = 1; c <= 3; c++) {
			System.out.println("Digite o " + c + "º numero:");
			acumulate *= scan.nextDouble();
			}
		double mediaGeometrica = Math.pow(acumulate, (1/3));
		System.out.println(mediaGeometrica);
		scan.close();
	}
}
