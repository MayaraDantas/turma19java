
package RevisaoLista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double peso, multa =0.0, excesso;
		
		System.out.println(" informe o peso total dos tomamates ?  ");
		peso = leia.nextInt();
		
		excesso = peso - 50;
		if (excesso > 0 ) {
			multa = excesso * 4.00;
			
		System.out.printf(" voce ultrapassou o limite de peso a multa é %.2f", multa);
			
		
		}
		
		else { System.out.printf (" voce não ultrapassou o limite, não tem multa" );
		System.out.printf(" multa: R$ %.2f", multa);
		System.out.printf(" excesso: R$ %.2f", excesso =0.0 );
		
		}
	}

}
