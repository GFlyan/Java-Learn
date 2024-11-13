/*
 * Crie um programa que receba uma frase e substitua todas as letras "a" por "e".
 * Utilize o método replace.
 * */

import java.util.Scanner;

public class Ex018 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma frase: ");
		String text = scan.nextLine();
		text = text.replace('a', 'e');
		text = text.replace('A', 'E');
		System.out.println("A nova frase é: "+ text);
		scan.close();
	}
}
