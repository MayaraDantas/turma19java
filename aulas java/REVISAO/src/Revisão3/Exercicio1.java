
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
 * A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

 * 
 */

package Revisão3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double salario, ultimoSalario, mediaSalario = 0, somaSalario = 0, mediaFilhos = 0;
		int i, filhos, totalPopulacao, totaLfilhos = 0;

		for (i = 1; i <= 20; i++) {

			System.out.println(" digite seu salario  ?  ");
			salario = leia.nextDouble();
			System.out.println(" digite quantos filhos você tem  ?  ");
			filhos = leia.nextInt();
			somaSalario = salario + somaSalario;
			totaLfilhos = filhos + totaLfilhos;
			totalPopulacao = totaLfilhos + i;
			mediaSalario = somaSalario / totalPopulacao;
			mediaFilhos = totaLfilhos / i;
			ultimoSalario = salario;

		}
		System.out.println(" salario total :  " + somaSalario);
		System.out.println(" media de salario : " + mediaSalario);
		System.out.println(" media filhos :" + mediaFilhos);
	}

}
