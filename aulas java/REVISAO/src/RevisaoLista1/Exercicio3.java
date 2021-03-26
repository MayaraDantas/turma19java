// inteiro %d
// double %f , %.2f

package RevisaoLista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tempoInfo, horas, minutos, segundos;
		
		
		System.out.println(" informe quantos segundos você trabalhou?  ");
		tempoInfo = leia.nextInt();
		
		horas = tempoInfo / 3600;
		minutos= (tempoInfo % 3600)/ 60;
		segundos = (tempoInfo % 3600) % 60;
		
		System.out.printf(" horas %d \n minutos %d \n segundos %d ", horas, minutos, segundos);	
	}
}
