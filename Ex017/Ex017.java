import java.util.Scanner;

/*
 Faça um programa que receba uma palavra e exiba cada letra separadamente
 (necessita de laço de repetição).
 */

public class Ex017 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma palavra:");
		String word = scan.nextLine();
		for(int counter = 0; counter < word.length(); counter++) {
			char letter = word.charAt(counter);
			System.out.println(letter);
		}
		scan.close();
	}
}
