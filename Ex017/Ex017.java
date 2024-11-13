import java.util.Scanner;

/*
 Faça um programa que receba uma palavra e exiba cada letra separadamente (for e for-each).
 */

public class Ex017 {
	public static void main(String[] args) {
		
		//Mostrando a palavra com for
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma palavra:");
		String word = scan.nextLine();
		for(int counter = 0; counter < word.length(); counter++) {
			char letter1 = word.charAt(counter);
			System.out.println(letter1);
		}
		
		//Mostrando a palavra com for-each
		System.out.println("Informe outra palavra: ");
		word = scan.nextLine();
		char [] letters = word.toCharArray();
		for(char letter2 : letters) {
			System.out.println(letter2);
		}
		scan.close();
	}
}
