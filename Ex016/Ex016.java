/*Crie um programa que leia duas palavras e as concatene 
 * exibindo a palavra resultante*/
import java.util.Scanner;

public class Ex016 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a primeira palavra:");
		String primeiraPalavra = scan.nextLine();
		System.out.println("Informe a segunda palavra:");
		String segundaPalavra = scan.nextLine();
		String novaPalavra = primeiraPalavra + segundaPalavra;
		System.out.println("A nova palavra formada é: " + novaPalavra);
		scan.close();
	}
}
