package Lista6;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

 * 
 */

import java.util.Scanner;

public class Exercicio2 {

	
		/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);

			int numero = 0, numeroPar = 0, numeroImpar = 0;

			for (int x = 0; x < 3; x++) {
				System.out.println("Digite um numero ? ");
				numero = leia.nextInt();

				if (numero % 2 == 0 && numero != 0) {
					numero = numeroPar++;

				} else if (numero % 2 >= 1) {
					numero = numeroImpar++;

				} 

			}
			System.out.println("Dos numeros digitados são pares " + numeroPar);
			System.out.println("Dos numeros digitados são impares " + numeroImpar);

		}

	}