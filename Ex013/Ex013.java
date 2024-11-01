/*Escreva um programa que calcule o trabalho realizado por uma 
 * força que atua sobre um objeto.*/

import java.util.Scanner;

public class Ex013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a força:");
		double forca = scan.nextDouble();
		System.out.println("Informe a distância:");
		double distancia = scan.nextDouble();
		double trabalho = forca * distancia;
		System.out.println("O trabalho realizado é:" + trabalho);
		scan.close();
	}
}
