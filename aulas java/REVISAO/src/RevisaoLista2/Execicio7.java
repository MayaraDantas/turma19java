/*
 *  Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos (positivos maiores que zero). 
 *  Em caso afirmativo, calcular a �rea do tri�ngulo.

 */

package RevisaoLista2;

import java.util.Scanner;

public class Execicio7 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double valoreBase, altura, area;

		System.out.println(" digite a base do tri�ngulo  ?  ");
		valoreBase = leia.nextDouble();

		System.out.println(" digite a altura do tri�ngulo  ?  ");
		altura = leia.nextDouble();
		area = (valoreBase * altura) / 2;

		if (valoreBase >= 1 && altura >= 1) {
			System.out.println(" a area do tri�ngulo � igual a:  "+ area);
		} else {
			System.out.println(" n�o foi possivel calcular as areas");

		}
		{

		}

	}
}