package RevisaoLista2;



import java.util.Scanner;

/*
 * Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se
 * este n�mero � par ou �mpar, e se � positivo ou negativo.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Digite um n�mero inteiro:");
		numero = leia.nextInt();

		if (numero == 0) {
			System.out.println("O n�mero %d � neutro");
		} else if (numero < 0 && (numero % 2) == 0) {
			System.out.println("O numero � negativo e par");
		} else if (numero < 0 && (numero % 2) != 1) {
			System.out.println("O n�mero � negativo e �mpar");
		} else if ((numero % 2) == 0) {
			System.out.println("O n�mero � positivo e par");
		} else {

			System.out.println("O n�mero � positivo e �mpar");
		}
	}

}
