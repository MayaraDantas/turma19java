package ListaDoDia25;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double tempoDuracao, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		tempoDuracao = leia.nextDouble();
		
		horas = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.printf("Hora[s]: %.0f\\nMinuto[s]: %.0f\\nSegundo[s]: %.0f", horas, minutos, segundos);
	}
}
