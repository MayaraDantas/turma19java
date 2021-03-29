/*
 * Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
 * múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 * 
 */




package Revisão3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int soma = 0;
			int multiplos;

			System.out.println("Os números multilplos de 3 e ímpares da contagem de 1 a 500: ");
			for (multiplos = 1; multiplos <= 500; multiplos++) {
				if (multiplos % 3 == 0) {
					if (multiplos % 2 != 0) {
						soma = multiplos + soma;

						System.out.println(multiplos);
					}
				}
			}
			System.out.println("\nA soma dos números multiplos de 3 e ímpares é:"+ soma);

		}

	}