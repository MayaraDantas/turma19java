package RevisaoLista2;

import java.util.Scanner;


/*Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
 */
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3, num4;

		System.out.println("Digite um n�mero:");
		num1 = leia.nextInt();
		System.out.println("Digite um n�mero:");
		num2 = leia.nextInt();
		System.out.println("Digite um n�mero:");
		num3 = leia.nextInt();
		System.out.println("Digite um n�mero:");
		num4 = leia.nextInt();

		if ((num3 * num3) >= 1000) {

			System.out.println("O valor do n�mero 3 �: " + num3);
			System.out.println("O quadrado do n�mero 3 �: " + num3 * num3);
		} else {
			System.out.println("O valor do n�mero 1 �: " + num1);
			System.out.println("O quadrado do n�mero 1 �: " + num1 * num1);
			System.out.println("O valor do n�mero 2 �: " + num2);
			System.out.println("O quadrado do n�mero 2 �: " + num2 * num2);
			System.out.println("O valor do n�mero 3 �: " + num3);
			System.out.println("O quadrado do n�mero 3 �: " + num3 * num3);
			System.out.println("O valor do n�mero 4 �: " + num4);
			System.out.println("O quadrado do n�mero 4 �: " + num4 * num4);
		}

	}
}
