package RevisaoLista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int nota1, nota2, nota3; 
		int mediaPonderada;
		
		System.out.println(" digite o valor de nota1 ");
		nota1 = leia.nextInt();
		System.out.println(" digite o valor de nota2 ");
		nota2 = leia.nextInt();
		System.out.println(" digite o valor de A nota3 ");
		nota3= leia.nextInt();
		
	    mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/(2+3+5);
		System.out.printf("A média ponderada é: %d", mediaPonderada);

		
	}

}
