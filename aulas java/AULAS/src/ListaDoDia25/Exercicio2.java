package ListaDoDia25;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int diasInfo, anos, meses, dias;
		
		System.out.println("Digite quantos dias de vida você tem: ");
		diasInfo = leia.nextInt();
		
		anos = diasInfo/365;
		meses = (diasInfo % 365) / 30;
		dias = (diasInfo % 365) % 30;
		
		System.out.printf("Anos[s]: %d\nMes[es]: %d\nDia[s]: %d", anos, meses, dias);
	}
}
