package RevisaoLista2;



import java.util.Scanner;

/*
 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se
 * este número é par ou ímpar, e se é positivo ou negativo.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt();

		if (numero == 0) {
			System.out.println("O número %d é neutro");
		} else if (numero < 0 && (numero % 2) == 0) {
			System.out.println("O numero é negativo e par");
		} else if (numero < 0 && (numero % 2) != 1) {
			System.out.println("O número é negativo e ímpar");
		} else if ((numero % 2) == 0) {
			System.out.println("O número é positivo e par");
		} else {

			System.out.println("O número é positivo e ímpar");
		}
	}

}
