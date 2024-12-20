package exercicios_pre_prova;
import java.util.Scanner;
import java.lang.String;
import javax.swing.JOptionPane;

/*
Faça um programa que leia um conjunto X de valores compreendidos 
entre [ min, max ], em que min e max representam os valores inferior 
e superior do intervalo. Ao final de sua execução o programa deverá imprimir 
o histograma do intervalo.
*/

public class Ex001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Definindo os limites superiores e inferiores permitidos para incidências no histograma
		System.out.println("Informe o limite inferior: ");
		int min = scan.nextInt();
		System.out.println("Informe o limite superior: ");
		int max = scan.nextInt();
		
		//Criando vetor histograma
		
		int size = max-min+1;
		int[] range = new int[size];
		for(int counter = 0; counter < size; counter++) {
			range[counter] = min + counter;
		}
		
		
		//Calculando o fluxo do incidência para o histograma
		int userValue; //Valor fornecido pelo usuário
		String acumulate = "";
		do {
			System.out.println("Forneça valores em um raio de: ["+ min + "," + max + "]");
			userValue = scan.nextInt();
			if((userValue<min)||(userValue>max)){ //Verificação se o valor fornecido pelo usuário está entre os valores permitidos
				System.out.println("Você digitou um valor não permitido.");
				break;
			}
			acumulate += userValue; /*Caso userValue seja válido será 
									  armazenado em uma "pilha" onde 
									  a verificação de incidências será 
									  feita posteriormente*/
	
		}
		while((userValue>=min)&&(userValue<=max));
		
		//
		for(int counterRange = 0; counterRange<size ; counterRange++) {//Percorre o vetor range para verificar a incidencia dos valores fornecidos
			int incidencia=0;
			for(int counterAcumulate = 0; counterAcumulate < acumulate.length(); counterAcumulate++ ) { //Percorre a cadeia acumulate
				if(acumulate.charAt(counterAcumulate) == range[counterRange]) {
					incidencia++;
				}
				String astherisc = "*";
				System.out.println(range[counterRange] + astherisc.repeat(incidencia));
			}
				
		}
				
		scan.close();
		
	}
}
