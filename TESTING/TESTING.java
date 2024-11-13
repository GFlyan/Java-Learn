import java.util.Scanner;

public class TESTING {
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
		String acumulateStr = "";
		do {
			System.out.println("Forneça valores em um raio de: ["+ min + "," + max + "]");
			userValue = scan.nextInt();
			if((userValue<min)||(userValue>max)){ //Verificação se o valor fornecido pelo usuário está entre os valores permitidos
				System.out.println("Você digitou um valor não permitido.");
				break;
			}
			acumulateStr += userValue; /*Caso userValue seja válido será 
									  armazenado em uma "pilha" onde 
									  a verificação de incidências será 
									  feita posteriormente*/
	
		}
		while((userValue>=min)&&(userValue<=max));
		
		
		//
		System.out.println("----------");
		System.out.println("HISTOGRAMA");
		System.out.println("----------");
		for(int counterRange = 0; counterRange<size ; counterRange++) {//Percorre o vetor range para verificar a incidencia dos valores fornecidos
			int incidencia=0;
			for(int counterAcumulate = 0; counterAcumulate < acumulateStr.length(); counterAcumulate++ ) { //Percorre a cadeia acumulate
				int acumulateStrInt = Integer.parseInt(Character.toString(acumulateStr.charAt(counterAcumulate)));		
				if(acumulateStrInt == range[counterRange]) {
					incidencia++;
				}

			}

			System.out.println(range[counterRange]+ " " + "*".repeat(incidencia));
		}
				
		scan.close();
		
	}
}
