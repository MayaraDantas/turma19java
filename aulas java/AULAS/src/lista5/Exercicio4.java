package lista5;


import java.util.Scanner;
public class Exercicio4 {


	


		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int numero;
			
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero == 0) {
				System.out.println("Numero NEUTRO.");
			}
			else if((numero%2 == 0)) {
				System.out.printf("O numero %d é PAR ", numero,"\n");
				System.out.printf("Sua Raiz Quadrada é %.1f", Math.sqrt(numero));
			}
			else if((numero%2 == 1)) {
				System.out.printf("O numero %d é IMPAR ", numero,"\n");
				System.out.printf("Elevado ao Quadrado fica %.1f", Math.pow(numero,2));
			}
			
		}
	}


