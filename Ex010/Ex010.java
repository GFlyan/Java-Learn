/*Escreva um programa que calcule o perímetro e a área 
 * de um triângulo utilizando as fórmulas:
 * P = a+b+c
 * A = b*h 
 * Onde h é a altura relativa ao lado b*/

import java.util.Scanner;

public class Ex010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do lado A:");
		double ladoA = scan.nextDouble();
		System.out.println("Informe o valor do lado B:");
		double ladoB = scan.nextDouble();
		System.out.println("Informe o valor do lado C:");
		double ladoC = scan.nextDouble();
		System.out.println("Informe a altura do triângulo:");
		double altura = scan.nextDouble();
		double perimetroTriangulo = ladoA + ladoB + ladoC;
		System.out.println("O valor do pêrimetro é: " + perimetroTriangulo);
		double areaTriangulo = (ladoB * altura) / 2;
		System.out.println("O valor da área é: " + areaTriangulo);
		scan.close();
	}
}
