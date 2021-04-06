package lista5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int int1, int2, int3;

		System.out.println("Por favor, insira um número inteiro qualquer: ");
		int1 = leia.nextInt();
		System.out.println("Por favor, insira mais um número inteiro qualquer: ");
		int2 = leia.nextInt();
		System.out.println("Por favor, insira um último número inteiro qualquer: ");
		int3 = leia.nextInt();

		if (int1 == int2 && int1 == int3) {
			System.out.printf("Os números são equivalentes: %d, %d, %d", int1, int2, int3);
		} else if (int1 < int2 && int2 < int3) {
			System.out.printf("Os números em ordem crescente são %d, %d e %d", int1, int2, int3);
		} else if (int1 > int2 && int2 > int3) {
			System.out.printf("Os números em ordem crescente são %d, %d e %d", int3, int2, int1);
		} else if (int2 > int1 && int2 > int3 && int3 < int1) {
			System.out.printf("Os números em ordem crescente são %d, %d e %d\n", int2, int3, int1);
		} else if (int2 > int1 && int2 > int3 && int3 > int1) {
			System.out.printf("Os números em ordem crescente são %d, %d e %d\n", int1, int3, int2);
		}
		System.out.println("\nPROGRAMA FINALIZADO!");

	}

}
