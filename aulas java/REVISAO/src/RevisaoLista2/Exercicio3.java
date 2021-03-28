package RevisaoLista2;

import java.util.Scanner;


/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3, num4;

		System.out.println("Digite um número:");
		num1 = leia.nextInt();
		System.out.println("Digite um número:");
		num2 = leia.nextInt();
		System.out.println("Digite um número:");
		num3 = leia.nextInt();
		System.out.println("Digite um número:");
		num4 = leia.nextInt();

		if ((num3 * num3) >= 1000) {

			System.out.println("O valor do número 3 é: " + num3);
			System.out.println("O quadrado do número 3 é: " + num3 * num3);
		} else {
			System.out.println("O valor do número 1 é: " + num1);
			System.out.println("O quadrado do número 1 é: " + num1 * num1);
			System.out.println("O valor do número 2 é: " + num2);
			System.out.println("O quadrado do número 2 é: " + num2 * num2);
			System.out.println("O valor do número 3 é: " + num3);
			System.out.println("O quadrado do número 3 é: " + num3 * num3);
			System.out.println("O valor do número 4 é: " + num4);
			System.out.println("O quadrado do número 4 é: " + num4 * num4);
		}

	}
}
