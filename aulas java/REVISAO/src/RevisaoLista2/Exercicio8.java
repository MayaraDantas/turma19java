/*
 *  Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.


 */

package RevisaoLista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;
		System.out.println("  digite um numero  ");
		n = leia.nextInt();
      
		if (n <=100 ) {
			System.out.println("  seu valor é 0 ");
		}
		else { System.out.println("  seu valor é " + n );
			
		}
	}
    
}
