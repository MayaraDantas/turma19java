/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

 * 
 */

package RevisaoLista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, infantilA = 0, infantilB = 0, juvenilA = 0, juvenilB = 0, adultos = 0;

		System.out.println(" Por favor me informe sua idade ?  ");
		idade = leia.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println(" você é da categoria infantil A  ");

		} else if (idade >= 8 && idade <= 11) {
			System.out.println(" você é da categoria infantil B  ");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println(" você é da categoria juvenil A  ");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println(" você é da categoria juvenil B ");
		} else if (idade >= 18) {
			System.out.println(" você é da categoria adulto  ");
		} else if (idade < 5) {
			System.out.println(" você não entra e nenhuma categoria. ");
		}
	}
}
