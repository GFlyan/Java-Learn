/*Escreva um programa que leia a posição x e y
 * de dois pontos no plano cartesiano e calcule 
 * a distância entre ambos*/

import java.util.Scanner;

public class Ex014 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a posição x do ponto a:");
		double xa = scan.nextDouble();
		System.out.println("Informe a posição y do ponto a:");
		double ya = scan.nextDouble();
		System.out.println("Informe a posição x do ponto b:");
		double xb = scan.nextDouble();
		System.out.println("Informe a posição y do ponto b:");
		double yb = scan.nextDouble();
		double distancia = Math.sqrt((Math.pow((yb-ya), 2) + Math.pow((xb-xa), 2)));
		System.out.println("A distância entre os dois pontos é: " + distancia);
		scan.close();
	}
}
