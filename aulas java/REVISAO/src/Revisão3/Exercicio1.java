
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. 
 * A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.  

 * 
 */

package Revis�o3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double salario, ultimoSalario, mediaSalario = 0, somaSalario = 0, mediaFilhos = 0;
		int i, filhos, totalPopulacao, totaLfilhos = 0;

		for (i = 1; i <= 20; i++) {

			System.out.println(" digite seu salario  ?  ");
			salario = leia.nextDouble();
			System.out.println(" digite quantos filhos voc� tem  ?  ");
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
