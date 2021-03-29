package Revisão3;

import java.util.Scanner;

public class Exercicio6 {
	
	
	

		public static void main (String[] args) {
			
			Scanner leia = new Scanner(System.in);
			        int numeroTec;
					int soma = 0;
					int limite = 0;
					System.out.println("Digite um número de 1 à 9 que estão dispostos no teclado:");
					numeroTec = leia.nextInt();

					do {
						limite++;
						soma = soma + limite;
						}
						while (limite < numeroTec);{
						System.out.println(soma);
					
				}
			
	}

}
