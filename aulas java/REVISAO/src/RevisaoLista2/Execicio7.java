/*
 *  Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
 *  Em caso afirmativo, calcular a área do triângulo.

 */

package RevisaoLista2;

import java.util.Scanner;

public class Execicio7 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double valoreBase, altura, area;

		System.out.println(" digite a base do triângulo  ?  ");
		valoreBase = leia.nextDouble();

		System.out.println(" digite a altura do triângulo  ?  ");
		altura = leia.nextDouble();
		area = (valoreBase * altura) / 2;

		if (valoreBase >= 1 && altura >= 1) {
			System.out.println(" a area do triângulo é igual a:  "+ area);
		} else {
			System.out.println(" não foi possivel calcular as areas");

		}
		{

		}

	}
}